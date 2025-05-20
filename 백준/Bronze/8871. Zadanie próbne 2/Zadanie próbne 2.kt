import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt() + 1
    bw.write("${n * 2} ${n * 3}")

    bw.close()
    br.close()
}