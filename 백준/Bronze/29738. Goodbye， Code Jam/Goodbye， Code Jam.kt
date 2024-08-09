import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val result = when (br.readLine().toInt()) {
            in 1..25 -> "World Finals"
            in 26..1000 -> "Round 3"
            in 1001..4500 -> "Round 2"
            else -> "Round 1"
        }

        bw.write("Case #${it + 1}: $result\n")
    }

    bw.close()
    br.close()
}