import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    bw.write("${n * (n - 1) * (n - 2) * (n - 3) / 24}")

    bw.close()
    br.close()
}