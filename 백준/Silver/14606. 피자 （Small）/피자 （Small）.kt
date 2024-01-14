import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val pizza = Array(11) {0}
    pizza[2] = 1

    for (i in 3 .. 10) {
        pizza[i] = i - 1 +  pizza[i - 1]
    }
    bw.write("${pizza[n]}")

    bw.close()
    br.close()
}