import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val input = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val stack = Stack<Int>()
    var now = 1
    var result = "Nice"

    while (input.isNotEmpty()){
        if(input.first() == now){
            input.removeFirst()
            now++
        }else if(stack.isNotEmpty() && stack.peek() == now){
            stack.pop()
            now++
        }else{
            stack.push(input.first())
            input.removeFirst()
        }
    }

    while (stack.isNotEmpty()){
        if(now == stack.peek()){
            stack.pop()
            now++
        }else{
            result = "Sad"
            break
        }
    }

    bw.write(result)

    bw.close()
    br.close()
}