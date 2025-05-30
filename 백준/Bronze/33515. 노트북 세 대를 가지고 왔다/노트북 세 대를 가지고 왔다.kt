import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${br.readLine().split(" ").map { it.toInt() }.min()}")

    bw.close()
    br.close()
}