import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (s, k) = br.readLine().split(" ").map { it.toInt() }
    var result = 1L
    val div = s / k
    val left = s % k

    repeat(left) {
        result *= (div + 1)
    }

    repeat(k - left) {
        result *= div
    }

    bw.write("$result")

    bw.close()
    br.close()
}