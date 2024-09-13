import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toLong() }
    val n = input[0].toInt()
    val m = input[1]
    val arr = br.readLine().split(" ").map { it.toLong() }
    var front = 0
    var end = 0
    var sum = 0L
    var result = 0

    while (true) {
        if (sum >= m) {
            sum -= arr[front++]
        } else if (end == n) {
            break
        } else {
            sum += arr[end++]
        }

        if (sum == m) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}