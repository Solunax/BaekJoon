import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (s, d, i, l, n) = br.readLine().split(" ").map { it.toDouble() }
    val sum = s + d + i + l
    var bless = 0

    while (true) {
        if ((sum + bless) / 4 >= n) {
            bw.write("$bless")
            break
        }

        bless++
    }

    bw.close()
    br.close()
}