import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<BooleanArray>

fun main() {
    val n = br.readLine().toInt()
    map = Array(n + 1) { BooleanArray(n + 1) }

    for (i in 1 until n) {
        br.readLine()
        val st = StringTokenizer(br.readLine())

        while (st.hasMoreTokens()) {
            map[i][st.nextToken().toInt()] = true
        }
    }

    for (k in 1 until n) {
        for (i in 1 until n) {
            for (j in 1 until n) {
                if (map[i][k] && map[k][j]) {
                    map[i][j] = true
                }
            }
        }
    }

    var result = "NO CYCLE"
    for (i in 1 until n) {
        if (map[1][i] && map[i][i]) {
            result = "CYCLE"
            break
        }
    }
    bw.write(result)

    bw.close()
    br.close()
}