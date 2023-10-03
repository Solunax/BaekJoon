import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0.0
    var count = 0
    val input = br.readLine().split("").filter { it.isNotEmpty() }

    for(i in input.indices){
        when(input[i]){
            "A" -> {
                sum += 4
                count++
            }
            "B" -> {
                sum += 3
                count++
            }
            "C" -> {
                sum += 2
                count++
            }
            "D" -> {
                sum += 1
                count++
            }
            "F" -> count++
            "+" -> sum += 0.5
        }
    }

    bw.write("%.5f".format(sum / count))

    bw.close()
    br.close()
}