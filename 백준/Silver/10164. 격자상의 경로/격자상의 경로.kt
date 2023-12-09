import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1){ Array(m + 1){0} }

    if (k == 0) {
        map[0][1] = 1
        for (i in 1 .. n) {
            for (j in 1 .. m) {
                map[i][j] = map[i - 1][j] + map[i][j - 1]
            }
        }

        bw.write("${map[n][m]}")
    } else {
        var result = 1
        val mx = k / m + 1
        val my = k % m

        map[0][1] = 1
        for (i in 1 .. mx) {
            for (j in 1 .. my) {
                map[i][j] = map[i - 1][j] + map[i][j - 1]
            }
        }

        result *= map[mx][my]
        map[mx - 1][my] = 1
        map[mx][my - 1] = 0
        for (i in mx .. n){
            for (j in my .. m) {
                map[i][j] = map[i - 1][j] + map[i][j - 1]
            }
        }

        result *= map[n][m]
        bw.write("$result")
    }

    bw.close()
    br.close()
}