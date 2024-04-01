import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c, d) = br.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(br.readLine())

    repeat(3) {
        val n = st.nextToken().toInt()
        val t1 = n % (a + b)
        val t2 = n % (c + d)
        var count = 0

        if (t1 <= a && t1 != 0) {
            count++
        }

        if (t2 <= c && t2 != 0) {
            count++
        }

        bw.write("$count\n")
    }

    bw.close()
    br.close()
}