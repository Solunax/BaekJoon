import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = br.readLine().split(" ").map { it.toInt() }
    var left = 0L
    var right = 0L
    var sum = 0L
    var move = 0L

    for (i in 0 until n) {
        if (num[i] % 2 == 0) {
            sum += move++
            left += i
            right += n - 1 - i
        }
    }

    bw.write("${min(left, right) - sum}")

    bw.close()
    br.close()
}