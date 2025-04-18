import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        bw.write("${st.nextToken()} ")
        val d = st.nextToken().toDouble()
        val a = st.nextToken().toDouble()
        val b = st.nextToken().toDouble()
        val f = st.nextToken().toDouble()
        bw.write("%.6f\n".format(d / (a + b) * f))
    }

    bw.close()
    br.close()
}