import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val meal = br.readLine().split(" ").map { it.toInt() }
    val want = br.readLine().split(" ").map { it.toInt() }

    var result = 0
    repeat(3){
        val diff = want[it] - meal[it]

        if(diff > 0)
            result += diff
    }

    bw.write("$result")

    bw.close()
    br.close()
}