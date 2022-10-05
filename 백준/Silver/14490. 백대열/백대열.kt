import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(":").map { it.toInt() }

    var big = max(n, m)
    var small = min(n, m)
    while(true){
        val res =  big % small

        if(res == 0)
            break
        else
            big = small.also { small = res }
    }

    bw.write("${n/small}:${m/small}")

    bw.close()
    br.close()
}