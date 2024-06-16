import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var num = 1L
    val mod = 1000000000000

    for (i in 1..n) {
        num *= i
        while (num % 10 == 0L) {
            num /= 10
        }
        num %= mod
    }
    num %= 100000

    bw.write("%05d".format(num))

    bw.close()
    br.close()
}