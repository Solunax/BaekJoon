import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val chess = listOf(1, 1, 2, 2, 2, 8)
    val now = br.readLine().split(" ").map { it.toInt() }

    for(i in chess.indices){
        if(now[i] > chess[i])
            bw.write("-${abs(now[i] - chess[i])} ")
        else if(now[i] < chess[i])
            bw.write("${abs(now[i] - chess[i])} ")
        else
            bw.write("0 ")
    }

    bw.close()
    br.close()
}
