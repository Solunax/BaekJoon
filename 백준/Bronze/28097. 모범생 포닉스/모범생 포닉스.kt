import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    var sum = 0

    repeat(n) {
        sum += st.nextToken().toInt() + 8
    }
    sum -= 8

    bw.write("${sum / 24} ${sum % 24}")

    bw.close()
    br.close()
}