import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val stone = br.readLine().split(" ").map { it.toInt() }
    val total = stone.sum().toDouble()
    val k = br.readLine().toInt()
    var result = 0.0

    for (color in stone) {
        if (color < k) {
            continue
        }

        var p = 1.0
        for (j in 0 until k) {
            p *= (color - j) / (total - j)
        }

        result += p
    }
    bw.write("$result")

    bw.close()
    br.close()
}