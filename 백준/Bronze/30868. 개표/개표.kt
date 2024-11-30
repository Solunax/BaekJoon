import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val vote = br.readLine().toInt()
        val sb = StringBuilder()

        repeat(vote / 5) {
            sb.append("++++ ")
        }

        repeat(vote % 5) {
            sb.append("|")
        }

        bw.write("$sb\n")
    }

    bw.close()
    br.close()
}