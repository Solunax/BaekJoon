import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var sum = 0

    for (i in 1..n) {
        if (n % i == 0) {
            sum += i
        }
    }
    bw.write("${sum * 5 - 24}")

    bw.close()
    br.close()
}