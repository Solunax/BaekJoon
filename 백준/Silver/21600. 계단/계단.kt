import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n){0}
    var result = 0
    var before = 0
    var now: Int

    for (i in 0 until n) {
        now = min(before + 1, arr[i])
        result = max(result, now)
        before = now
    }
    bw.write("$result")

    bw.close()
    br.close()
}