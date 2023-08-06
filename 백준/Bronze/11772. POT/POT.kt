import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0

    repeat(br.readLine().toInt()){
        val input = br.readLine()
        val v1 = input.substring(0, input.length - 1).toDouble()
        val v2 = input.substring(input.length - 1).toInt()

        sum += v1.pow(v2).toInt()
    }
    bw.write("$sum")

    bw.close()
    br.close()
}