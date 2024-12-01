import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    val set = arr.toHashSet()
    var count = 0

    for (i in set) {
        count = max(count, arr.count { it == i })
    }
    bw.write("$count")

    bw.close()
    br.close()
}