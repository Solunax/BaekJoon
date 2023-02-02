import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, m) = br.readLine().split(" ").map{ it.toInt() }
    val score = br.readLine().split(" ").map { it.toInt() }.sorted()

    var result = 0
    var start = 0
    var end = score.size-1

    while(start < end){
        if(score[start] + score[end] >= m) {
            result++
            start++
            end--
        } else
            start++
    }
    bw.write("$result")

    br.close()
    bw.close()
}