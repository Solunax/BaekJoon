import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var max = 0
    var now = 0
    while(true){
        val (outCount, inCount) = br.readLine().split(" ").map { it.toInt() }

        now -= outCount

        if(inCount == 0)
            break

        now += inCount
        max = max(now, max)
    }
    bw.write("$max")

    br.close()
    bw.close()
}