import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, k) = br.readLine().split(" ").map { it.toInt() }
    val score = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    bw.write("${score[k-1]}")

    bw.close()
    br.close()
}