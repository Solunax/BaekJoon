import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    var start = 0
    var end = 0
    var oddCount = 0
    var maxLength = 0

    while (true) {
        if (oddCount > k) {
            if (arr[start] % 2 == 1) {
                oddCount--
            }
            start++
        } else if (end == n) {
            break
        } else {
            if (arr[end] % 2 == 1) {
                oddCount++
            }
            end++
        }

        if (oddCount <= k) {
            maxLength = max(maxLength, end - start - oddCount)
        }
    }
    bw.write("$maxLength")

    bw.close()
    br.close()
}