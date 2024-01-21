import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val fibo = Array(10001) { BigInteger("0") }
    fibo[1] = BigInteger("1")
    fibo[2] = BigInteger("1")

    for (i in 3..10000) {
        fibo[i] = fibo[i - 1].add(fibo[i - 2])
    }

    repeat(br.readLine().toInt()) {
        val (p, q) = br.readLine().split(" ").map { v -> v.toInt() }

        bw.write("Case #${it + 1}: ${fibo[p].remainder(BigInteger("$q"))}\n")
    }

    bw.close()
    br.close()
}