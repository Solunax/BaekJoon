import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val score = IntArray(5)
    val st = StringTokenizer(br.readLine())
    var num = 0

    repeat(n) {
        score[it] = st.nextToken().toInt()
    }

    num += abs(score[0] - score[2]) * if (score[0] > score[2]) {
        508
    } else {
        108
    }

    num += abs(score[1] - score[3]) * if (score[1] > score[3]) {
        212
    } else {
        305
    }

    if (score[4] > 0) {
        num += score[4] * 707
    }
    bw.write("${num * 4763}")

    bw.close()
    br.close()
}