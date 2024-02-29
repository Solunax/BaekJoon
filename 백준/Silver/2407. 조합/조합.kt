import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val pascal = Array(101) { Array(101) { BigInteger.ONE } }

    for (i in 1..n) {
        for (j in 1 until i) {
            pascal[i][j] = pascal[i - 1][j - 1].add(pascal[i - 1][j])
        }
    }

    bw.write("${pascal[n][m]}")

    bw.close()
    br.close()
}