import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var num = 1L
        val mod = 100000

        for (i in 2..n) {
            num *= i
            while (num % 10 == 0L) {
                num /= 10
            }
            num %= mod
        }

        bw.write("${num % 10}\n")
    }

    bw.close()
    br.close()
}