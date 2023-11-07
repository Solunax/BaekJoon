import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var dot = 7L
    var sum = 5L

    for (i in 1 until  n) {
        sum += dot
        dot += 3
    }
    bw.write("${sum % 45678}")

    bw.close()
    br.close()
}