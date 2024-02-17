import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, h) = br.readLine().split(" ").map { it.toInt() }
    val width = ArrayList<Int>()
    val height = ArrayList<Int>()

    width.add(0)
    width.add(h)
    height.add(0)
    height.add(w)

    repeat(br.readLine().toInt()) {
        val (dir, p) = br.readLine().split(" ").map { it.toInt() }

        when (dir) {
            0 -> width.add(p)
            1 -> height.add(p)
        }
    }
    width.sort()
    height.sort()

    var result = 0
    for (i in 0 until width.size - 1) {
        val v1 = width[i + 1] - width[i]

        for (j in 0 until height.size - 1) {
            val v2 = height[j + 1] - height[j]

            result = max(result, v1 * v2)
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}