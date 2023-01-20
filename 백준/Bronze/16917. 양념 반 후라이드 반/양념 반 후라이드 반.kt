import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(s, f, m, sWant, fWant) = br.readLine().split(" ").map { it.toInt() }

    val mixCount = min(fWant, sWant)
    val otherCount = max(fWant, sWant) - mixCount

    var result = min(mixCount * m * 2, f * mixCount + s * mixCount)
    result += if(fWant > sWant)
        otherCount * f
    else if(fWant < sWant)
        otherCount * s
    else
        0

    result = min(result, max(fWant, sWant) * m * 2)

    bw.write("$result")

    br.close()
    bw.close()
}