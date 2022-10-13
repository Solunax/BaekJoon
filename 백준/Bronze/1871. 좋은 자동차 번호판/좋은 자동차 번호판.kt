import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val pow = listOf(26.0.pow(2).toInt(), 26.0.pow(1).toInt(), 26.0.pow(0).toInt())
    repeat(br.readLine().toInt()){
        val input = br.readLine().split("-")
        var eSum = 0
        for(i in 0 until 3)
            eSum += (input[0][i].code - 'A'.code) * pow[i]

        val result = abs(eSum-input[1].toInt())

        if(result <= 100)
            bw.write("nice\n")
        else
            bw.write("not nice\n")
    }

    bw.close()
    br.close()
}