import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toLong()
    bw.write("${n * (n - 1) / 2}")

    bw.close()
    br.close()
}