import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toDouble() }
    val (c, d) = br.readLine().split(" ").map { it.toDouble() }

    val values = Array(4){0.0}
    values[0] = (a / c) + (b / d)
    values[1] = (c / d) + (a / b)
    values[2] = (d / b) + (c / a)
    values[3] = (b / a) + (d / c)

    var maxValue = 0.0
    var result = 0

    for(i in 0 until 4){
        if(values[i] > maxValue){
            result = i
            maxValue = values[i]
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}