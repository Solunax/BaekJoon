import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = Int.MAX_VALUE

    repeat(br.readLine().toInt()){
        val (need, time) = br.readLine().split(" ").map { it.toInt() }

        if(need < time)
            result = min(result, time)
    }

    if(result == Int.MAX_VALUE)
        bw.write("-1")
    else
        bw.write("$result")

    br.close()
    bw.close()
}