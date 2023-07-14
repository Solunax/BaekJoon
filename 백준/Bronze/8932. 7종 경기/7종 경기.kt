import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map { v -> v.toDouble() }
        var sum = 0

        sum += (9.23076 * (26.7 - input[0]).pow(1.835)).toInt()
        sum += (1.84523 * (input[1] - 75).pow(1.348)).toInt()
        sum += (56.0211 * (input[2] - 1.5).pow(1.05)).toInt()
        sum += (4.99087 * (42.5 - input[3]).pow(1.81)).toInt()
        sum += (0.188807 * (input[4] - 210).pow(1.41)).toInt()
        sum += (15.9803 * (input[5] - 3.8).pow(1.04)).toInt()
        sum += (0.11193 * (254 - input[6]).pow(1.88)).toInt()

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}