import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val army = HashMap<Long, Int>()
    repeat(br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        val t = st.nextToken().toInt()
        var maxCount = 0
        var strong = 0L

        repeat(t) {
            val n = st.nextToken().toLong()
            army[n] = army[n]?.plus(1) ?: 1

            if (army[n]!! > maxCount) {
                maxCount = max(maxCount, army[n]!!)
                strong = n
            }
        }

        if (maxCount > t / 2) {
            bw.write("$strong\n")
        } else {
            bw.write("SYJKGW\n")
        }

        army.clear()
    }

    bw.close()
    br.close()
}