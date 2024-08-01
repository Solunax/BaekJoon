import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().toInt()
        var now = 0

        if (n == 0) {
            break
        }

        repeat(n) {
            val str = br.readLine()
            while (now < str.length) {
                if (str[now] != ' ') {
                    now++
                } else {
                    break
                }
            }
        }

        bw.write("${now + 1}\n")
    }

    bw.close()
    br.close()
}