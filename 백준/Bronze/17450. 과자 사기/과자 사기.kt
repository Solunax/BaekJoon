import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var maxValue = 0.0
    val value = ArrayList<Double>()

    repeat(3){
        var (p, g) = br.readLine().split(" ").map { it.toDouble() * 10}

        if(p >= 5000)
            p -= 500

        val v = g / p

        value.add(v)
        maxValue = max(maxValue, v)
    }

    when (maxValue) {
        value[0] -> bw.write("S")
        value[1] -> bw.write("N")
        value[2] -> bw.write("U")
    }

    bw.close()
    br.close()
}