import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val r1 = br.readLine().split(" ").map { it.toInt() }
    val r2 = br.readLine().split(" ").map { it.toInt() }

    var result = 0
    for(i in 0 until n)
        result += abs(r1[i]) + abs(r2[i])

    bw.write("$result")

    br.close()
    bw.close()
}