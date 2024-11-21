import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val cat = br.readLine().split(" ").map { it.toLong() }.sorted().toMutableList()
    var point = n - 1
    var count = 0

    while (cat.isNotEmpty() && point > 0 && cat.first() <= k) {
        if (cat[0] + cat[point] <= k) {
            cat.removeAt(point)
            cat.removeFirst()
            point = cat.size - 1
            count++
        } else {
            point--
        }
    }
    
    bw.write("$count")

    bw.close()
    br.close()
}