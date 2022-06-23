import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    input.sortDescending()
    bw.write("${input[1]}")

    bw.close()
    br.close()
}