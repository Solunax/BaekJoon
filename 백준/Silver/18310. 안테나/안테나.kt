import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val house = br.readLine().split(" ").map{ it.toInt() }.sorted()

    bw.write("${house[(n-1)/2]}")

    bw.close()
    br.close()
}
