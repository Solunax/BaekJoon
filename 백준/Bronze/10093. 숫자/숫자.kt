import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map { it.toLong() }.sorted()
    var count = 0
    val sb = StringBuilder()

    for(i in v1 + 1 until v2){
        count++
        sb.append("$i ")
    }

    bw.write("$count\n$sb")

    bw.close()
    br.close()
}