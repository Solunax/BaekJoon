import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var now = br.readLine().toInt()
    var result = now
    var flag = true

    repeat(n){
        val (carIn , carOut) = br.readLine().split(" ").map { it.toInt() }

        now += carIn - carOut

        result = max(result, now)

        if(now < 0)
            flag = false
    }

    if(flag)
        bw.write("$result")
    else
        bw.write("0")

    bw.close()
    br.close()
}