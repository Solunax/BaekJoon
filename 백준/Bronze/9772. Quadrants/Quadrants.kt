import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toDouble()
        val y = st.nextToken().toDouble()

        if (x == 0.0 || y == 0.0) {
            bw.write("AXIS\n")
        } else if (x > 0.0 && y > 0.0) {
            bw.write("Q1\n")
        } else if (x < 0.0 && y > 0.0) {
            bw.write("Q2\n")
        } else if (x < 0.0 && y < 0.0) {
            bw.write("Q3\n")
        } else if (x > 0.0 && y < 0.0) {
            bw.write("Q4\n")
        }

        if (x == 0.0 && y == 0.0) {
            break
        }
    }

    bw.close()
    br.close()
}