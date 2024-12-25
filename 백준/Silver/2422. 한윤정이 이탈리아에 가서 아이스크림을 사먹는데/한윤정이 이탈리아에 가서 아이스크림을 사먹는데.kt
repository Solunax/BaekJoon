import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val mix = Array(n + 1) { BooleanArray(n + 1) }
    var result = 0

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        mix[v1][v2] = true
        mix[v2][v1] = true
    }

    for (i in 1..n) {
        for (j in i + 1..n) {
            if (!mix[i][j]) {
                for (k in j + 1..n) {
                    if (!mix[i][k] && !mix[j][k]) {
                        result++
                    }
                }
            }
        }
    }
    
    bw.write("$result")

    bw.close()
    br.close()
}