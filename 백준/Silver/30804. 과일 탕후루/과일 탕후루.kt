import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fruit = br.readLine().split(" ").map { it.toInt() }
    val count = IntArray(10)
    var k = 0
    var left = 0
    var result = 0

    for (right in 0 until n) {
        if (count[fruit[right]] == 0) {
            k++
        }
        count[fruit[right]]++

        while (k > 2) {
            count[fruit[left]]--
            if (count[fruit[left]] == 0) {
                k--
            }
            left++
        }
        result = max(result, right - left + 1)
    }
    bw.write("$result")

    bw.close()
    br.close()
}