import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0
    var start = 1
    var end = 1
    var sum = 1

    while (start <= end) {
        if (sum == n) {
            result++
        }

        if (sum < n) {
            end++
            sum += end
        } else if (sum >= n) {
            sum -= start
            start++
        }
    }
    
    bw.write("$result")

    bw.close()
    br.close()
}