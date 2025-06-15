import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0

    for (i in 1..n) {
        if (n % i == 0) {
            result += i
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}