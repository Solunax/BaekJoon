import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }
    val sum = IntArray(n + 1)

    for (i in 1..n) {
        sum[i] = sum[i - 1] + input[i - 1]
    }

    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${sum[b] - sum[a - 1]}\n")
    }

    bw.close()
    br.close()
}