import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    var result = 0
    br.readLine().split(" ").map { it.toInt() }.forEach{
        result = max(it, result)
    }

    bw.write("$result")

    br.close()
    bw.close()
}