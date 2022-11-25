import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    repeat(br.readLine().toInt()){
        val input = br.readLine().split("").filter { it.isNotEmpty() }
        val stack = Stack<String>()

        var top = -1
        input.forEach {
            stack.push(it)
            top++
            if(top > 0){
                if(stack[top] == stack[top-1]){
                    stack.pop()
                    stack.pop()
                    top -= 2
                }
            }
        }

        if(stack.isEmpty())
            result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}