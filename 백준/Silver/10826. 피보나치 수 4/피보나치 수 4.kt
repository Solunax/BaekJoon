import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fibo = Array(n + 1) { BigInteger("0") }

    if (n > 0) {
        fibo[1] = BigInteger("1")
    }

    if (n > 1) {
        fibo[2] = BigInteger("1")
    }

    for (i in 3..n) {
        fibo[i] = fibo[i - 1].plus(fibo[i - 2])
    }
    bw.write("${fibo[n]}")

    bw.close()
    br.close()
}