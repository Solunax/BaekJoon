import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    val maxValue = input.max()
    var result = 0

    input.forEach {
        result += maxValue - it
    }

    bw.write("$result")

    bw.close()
    br.close()
}