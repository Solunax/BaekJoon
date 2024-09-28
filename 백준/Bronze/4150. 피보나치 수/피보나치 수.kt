import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fibo = Array(n + 1) {BigInteger.ONE}

    for (i in 3 .. n) {
        fibo[i] = fibo[i - 1].add(fibo[i - 2])
    }
    bw.write("${fibo[n]}")

    bw.close()
    br.close()
}