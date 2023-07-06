import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (d, h, m) = br.readLine().split(" ").map { it.toInt() }

    val start = (11 * 60 * 24) + (11 * 60) + 11
    val result = (d * 60 * 24) + (h * 60) + m - start

    if(result < 0)
        bw.write("-1")
    else
        bw.write("$result")

    bw.close()
    br.close()
}