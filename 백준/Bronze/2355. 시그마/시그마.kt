import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map{ it.toLong() }.sorted()

    bw.write("${(v1 + v2) * (v2 - v1 + 1) / 2}")

    bw.close()
    br.close()
}