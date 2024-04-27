import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val map = Array(26) { IntArray(26) }

fun main() {
    val n = br.readLine().toInt()
    var s: Int
    var e: Int

    for (y in 0 until 26) {
        for (x in 0 until 26) {
            if (y != x) {
                map[y][x] = 10000
            }
        }
    }

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        s = st.nextToken()[0] - 'a'
        st.nextToken()
        e = st.nextToken()[0] - 'a'
        map[s][e] = 1
    }

    for (k in 0 until 26) {
        for (i in 0 until 26) {
            if (i != k) {
                for (j in 0 until 26) {
                    if (i != j && j != k) {
                        map[i][j] = min(map[i][j], map[i][k] + map[k][j])
                    }
                }
            }
        }
    }

    repeat(br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        s = st.nextToken()[0] - 'a'
        st.nextToken()
        e = st.nextToken()[0] - 'a'

        if (map[s][e] != 0 && map[s][e] < 10000) {
            bw.write("T\n")
        } else {
            bw.write("F\n")
        }
    }

    bw.close()
    br.close()
}