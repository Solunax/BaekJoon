import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        var first = Int.MIN_VALUE
        var second = Int.MIN_VALUE
        val score = IntArray(10001)

        if (n == 0 && m == 0) {
            break
        }

        repeat(n) {
            val st = StringTokenizer(br.readLine())

            repeat(m) {
                score[st.nextToken().toInt()]++
            }
        }

        for (i in 1..10000) {
            first = max(first, score[i])
        }

        for (i in 1..10000) {
            if (score[i] != first) {
                second = max(second, score[i])
            }
        }

        for (i in 1..10000) {
            if (score[i] == second) {
                bw.write("$i ")
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}