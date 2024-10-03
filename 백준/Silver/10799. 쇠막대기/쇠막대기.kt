import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val stack = Stack<Char>()
    var result = 0

    for (i in input.indices) {
        if (input[i] == '(') {
            stack.push('(')
            continue
        }

        if (input[i] == ')') {
            stack.pop()

            if (input[i - 1] == '(') {
                result += stack.size
            } else {
                result++
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}