import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        if (n == 0) {
            break
        }

        val p = st.nextToken().toInt()
        val result = IntArray(3)

        if (p % 2 == 0) {
            result[0] = p - 1
            result[1] = n - p + 1
            result[2] = n - p + 2
        } else {
            result[0] = p + 1
            result[1] = n - p
            result[2] = n - p + 1
        }
        
        result.sort()
        bw.write("${result.joinToString(" ")}\n")
    }

    bw.close()
    br.close()
}