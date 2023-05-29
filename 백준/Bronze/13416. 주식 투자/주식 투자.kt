import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        var result = 0

        repeat(n){
            var maxValue = 0
            br.readLine().split(" ").map { it.toInt() }.forEach {
                maxValue = max(maxValue, it)
            }

            result += maxValue
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}