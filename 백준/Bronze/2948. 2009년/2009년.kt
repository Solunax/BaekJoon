import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val months = arrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365)
    val days = arrayOf("Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday")
    val (d, m) = br.readLine().split(" ").map { it.toInt() }

    bw.write(days[(months[m - 1] + d) % 7])

    bw.close()
    br.close()
}