import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine().toCharArray()
    val stack = Stack<Char>()
    stack.push(str[0])

    for (i in 1 until str.size) {
        if (str[i] == '(') {
            stack.push(str[i])
        } else {
            if (stack.isNotEmpty() && stack.peek() == '(') {
                stack.pop()
            } else {
                stack.push(str[i])
            }
        }
    }

    bw.write("${stack.size}")

    bw.close()
    br.close()
}