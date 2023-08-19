import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val stack = Stack<Int>()

    for(i in input.indices){
        when(input[i]){
            ')' -> {
                var sum = 0
                while (true){
                    if(stack.peek() == 0){
                        stack.pop()
                        stack.push(sum)
                        break
                    }

                    sum += stack.pop()
                }
            }
            '(' -> stack.push(0)
            'H' -> stack.push(1)
            'C' -> stack.push(12)
            'O' -> stack.push(16)
            else -> stack.push(stack.pop() * (input[i] - '0'))
        }
    }

    var sum = 0
    while (stack.isNotEmpty()){
        sum += stack.pop()
    }
    bw.write("$sum")


    bw.close()
    br.close()
}