import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a1, o1) = br.readLine().split(" ").map { it.toInt() }
    val (a2, o2) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${min(a1+o2, o1+a2)}")

    bw.close()
    br.close()
}