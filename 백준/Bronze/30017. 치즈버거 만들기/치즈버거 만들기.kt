import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (meat, cheese) = br.readLine().split(" ").map{ it.toInt() }
    meat -= 2
    cheese -= 1

    bw.write("${min(meat, cheese) * 2 + 3}")

    bw.close()
    br.close()
}