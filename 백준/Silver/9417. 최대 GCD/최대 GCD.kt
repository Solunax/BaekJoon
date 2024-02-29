import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
        val len = arr.size
        var maxValue = 0

        for (i in 0 until len - 1) {
            for (j in i + 1 until len) {
                maxValue = max(maxValue, gcd(arr[i], arr[j]))
            }
        }

        bw.write("$maxValue\n")
    }

    bw.close()
    br.close()
}

fun gcd(v1: Int, v2: Int): Int {
    return if (v2 == 0) {
        v1
    } else {
        gcd(v2, v1 % v2)
    }
}