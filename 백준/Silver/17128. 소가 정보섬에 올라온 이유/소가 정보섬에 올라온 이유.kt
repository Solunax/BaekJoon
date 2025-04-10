import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val cow = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val qArr = br.readLine().split(" ").map { it.toInt() - 1 }
    val dp = IntArray(n)
    var result = 0

    for (i in 0 until n) {
        val v2 = (i + 1) % n
        val v3 = (i + 2) % n
        val v4 = (i + 3) % n

        val t = cow[i] * cow[v2] * cow[v3] * cow[v4]
        dp[i] = t
        result += t
    }

    for (q in qArr) {
        var idx = q

        repeat(4) {
            dp[idx] = -dp[idx]
            result += 2 * dp[idx]
            if (--idx == -1) {
                idx = n - 1
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}