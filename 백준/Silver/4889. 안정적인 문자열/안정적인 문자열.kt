import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var seq = 1
    while (true) {
        val input = br.readLine()

        if (input[0] == '-') {
            break
        } else if (input.isEmpty()) {
            bw.write("$seq. 0\n")
        } else {
            var count = 0
            val stack = Stack<Char>()

            for (c in input) {
                if (c == '{') {
                    stack.push(c)
                } else {
                    if (stack.isEmpty()) {
                        count++
                        stack.push('{')
                    } else {
                        stack.pop()
                    }
                }
            }

            bw.write("$seq. ${count + stack.size / 2}\n")
        }

        seq++
    }


    bw.close()
    br.close()
}