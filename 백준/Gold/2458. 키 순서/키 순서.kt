import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val tall = Array(n + 1) { Array(n + 1) { false } }

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        tall[v1][v2] = true
    }

    for (k in 1 .. n) {
        for (i in 1 .. n) {
            for (j in 1 .. n) {
                if (tall[i][k] && tall[k][j]){
                    tall[i][j] = true
                }
            }
        }
    }

    var result = 0
    for (i in 1 .. n) {
        var count = 0

        for (j in 1 .. n) {
            if (tall[i][j] || tall[j][i]) {
                count++
            }
        }
        if (count == n - 1) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}