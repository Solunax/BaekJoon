import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toLong()
    bw.write("${((n - 2) * (n - 1) * n) / 6}\n3")

    bw.close()
    br.close()
}