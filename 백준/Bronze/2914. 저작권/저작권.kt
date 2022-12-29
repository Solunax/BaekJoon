import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.ceil

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (song, avg) = br.readLine().split(" ").map { it.toDouble() }
    var result = 1.0
    while(true){
        if(ceil(result / song) == avg)
            break
        else
            result++
    }
    bw.write("${result.toInt()}")

    br.close()
    bw.close()
}