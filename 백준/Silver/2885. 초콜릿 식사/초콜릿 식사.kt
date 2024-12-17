import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var k = br.readLine().toInt()
    var n = 1
    var count = 0

    while (n < k) {
        n *= 2
    }
    bw.write("$n ")

    while (k > 0) {
        if (k >= n) {
            k -= n
        } else {
            n /= 2
            count++
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}