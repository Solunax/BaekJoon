import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
const val MOD = 14579

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    var sum = (a + 1) * a / 2 % MOD
    var result = sum

    for (i in a + 1 .. b) {
        sum += i
        result *= sum
        result %= MOD
    }
    bw.write("$result")

    bw.close()
    br.close()
}