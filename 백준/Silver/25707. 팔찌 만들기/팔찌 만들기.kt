import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    bw.write("${(arr.last() - arr.first())*2}")

    bw.close()
    br.close()
}