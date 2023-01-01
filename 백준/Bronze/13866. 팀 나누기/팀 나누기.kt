import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    bw.write("${abs((input[3]+input[0])-(input[2]+input[1]))}")

    br.close()
    bw.close()
}