import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toCharArray()
    val stack = Stack<Int>()

    input.forEach {
        if (it in '0' .. '9') {
            stack.push(it - '0')
        } else {
            val n1 = stack.pop()
            val n2 = stack.pop()
            when (it) {
                '+' -> stack.push(n1 + n2)
                '-' -> stack.push(n2 - n1)
                '*' -> stack.push(n1 * n2)
                '/' -> stack.push(n2 / n1)
            }
        }
    }
    bw.write("${stack.pop()}")

    bw.close()
    br.close()
}