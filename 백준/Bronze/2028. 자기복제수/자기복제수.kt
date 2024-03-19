import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine()
        val powN = (n.toInt() * n.toInt()).toString()
        val result = powN.substring(powN.length - n.length)

        if (n == result) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.close()
    br.close()
}