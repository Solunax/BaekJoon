import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var max = 0
    var now = 0
    repeat(4){
        val(outP, inP) = br.readLine().split(" ").map{ it.toInt() }
        now += inP - outP
        max = max(now, max)
    }

    bw.write("$max")
    bw.close()
    br.close()
}