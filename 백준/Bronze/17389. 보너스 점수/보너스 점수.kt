import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().toInt()

    var result = 0
    var bonus = 0
    var score = 1
    br.readLine().split("").filter { it.isNotEmpty() }.forEach {
        when(it){
            "O" -> {
                result += score + bonus
                bonus++
            }
            "X" -> bonus = 0
        }
        score++
    }

    bw.write("$result")

    bw.close()
    br.close()
}