import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v1 = br.readLine().toInt()
    val v2 = br.readLine().toInt()

    bw.write("${v2 + v2 - v1}")

    bw.close()
    br.close()
}