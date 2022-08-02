import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var best = Pair(0, 0)
    repeat(5){
        var sum = 0
        br.readLine().split(" ").map { o -> o.toInt() }.forEach { v ->
            sum += v
        }
        if(best.second < sum)
            best = Pair(it + 1, sum)
    }

    bw.write("${best.first} ${best.second}")

    bw.close()
    br.close()
}