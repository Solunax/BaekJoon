import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val maxDp = Array(3) { 0 }
    val minDp = Array(3) { 0 }
    var tempV0: Int
    var tempV2: Int

    for (i in 0 until n) {
        val (v1, v2, v3) = br.readLine().split(" ").map { it.toInt() }

        if (i == 0) {
            maxDp[0] = v1
            minDp[0] = v1
            maxDp[1] = v2
            minDp[1] = v2
            maxDp[2] = v3
            minDp[2] = v3
        } else {
            tempV0 = maxDp[0]
            tempV2 = maxDp[2]
            maxDp[0] = max(maxDp[0], maxDp[1]) + v1
            maxDp[2] = max(maxDp[1], maxDp[2]) + v3
            maxDp[1] = max(tempV0, max(maxDp[1], tempV2)) + v2

            tempV0 = minDp[0]
            tempV2 = minDp[2]
            minDp[0] = min(minDp[0], minDp[1]) + v1
            minDp[2] = min(minDp[1], minDp[2]) + v3
            minDp[1] = min(tempV0, min(minDp[1], tempV2)) + v2
        }
    }
    bw.write("${max(maxDp[0], max(maxDp[1], maxDp[2]))} ")
    bw.write("${min(minDp[0], min(minDp[1], minDp[2]))}")

    bw.close()
    br.close()
}