import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var score = 1
    var result = 0
    
    br.readLine()
    br.readLine().split(" ").map { it.toInt() }.forEach {
        if (it == 1) {
            result += score
            score++
        } else
            score = 1
    }

    bw.write("$result")

    bw.close()
    br.close()
}