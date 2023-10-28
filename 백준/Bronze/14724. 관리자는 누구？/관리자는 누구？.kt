import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val name = listOf("PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY")
    br.readLine()
    var maxValue = 0
    var index = 0

    repeat(9){
        val score = br.readLine().split(" ").map { v -> v.toInt() }.sortedDescending()[0]

        if(score > maxValue){
            maxValue = score
            index = it
        }
    }
    bw.write(name[index])

    bw.close()
    br.close()
}