import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }.sorted()

        var sum = 0
        input.forEach {
            sum += it
        }
        val avg = sum / n

        val result = (abs(avg - input.first()) + abs(avg - input.last())) * 2
        bw.write("$result\n")
    }

    br.close()
    bw.close()
}