import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val stack = Stack<Char>()
    var flag = true
    
    for(i in input.indices) {
        val char = input[i]
        if(char == 'P')
            stack.push('P')
        else{
            if(stack.size >= 2 && i < input.length - 1 && input[i + 1] == 'P'){
                stack.pop()
                stack.pop()
            }else{
                flag = false
                break
            }
        }
    }

    if(stack.size == 1 && flag)
        bw.write("PPAP")
    else
        bw.write("NP")

    bw.close()
    br.close()
}