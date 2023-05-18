import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val weight = Pair(2.2046, 0.4536)
    val volume = Pair(0.2642, 3.7854)

    repeat(br.readLine().toInt()){
        val (n, c) = br.readLine().split(" ")
        val num = n.toDouble()
        val resultUnit : String
        val resultValue = when(c){
            "kg" -> {
                resultUnit = "lb"
                num * weight.first
            }
            "lb" -> {
                resultUnit = "kg"
                num * weight.second
            }
            "l" -> {
                resultUnit = "g"
                num * volume.first
            }
            "g" -> {
                resultUnit = "l"
                num * volume.second
            }
            else -> {
                resultUnit = "e"
                0.0
            }
        }

        bw.write("%.4f %s\n".format(resultValue, resultUnit))
    }

    bw.close()
    br.close()
}