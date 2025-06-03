import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val s = br.readLine()

    if (s.last() != 'G') {
        bw.write(s + 'G')
    } else {
        bw.write(s.substring(0, n - 1))
    }

    bw.close()
    br.close()
}