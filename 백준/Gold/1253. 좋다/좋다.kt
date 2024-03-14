import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    var result = 0

    for (i in 0 until n) {
        val targetNumber = arr[i]
        var start = 0
        var end = n - 1
        var sum: Int

        while (start < end) {
            sum = arr[start] + arr[end]

            if (sum == targetNumber) {
                if (i == start) {
                    start++
                } else if (i == end) {
                    end--
                } else {
                    result++
                    break
                }
            } else if (sum < targetNumber) {
                start++
            } else {
                end--
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}