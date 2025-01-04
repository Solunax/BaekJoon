import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val money = br.readLine().split(" ").map { it.toInt() }
    var sum = 0L

    for (i in 0 until m) {
        sum += money[i]
    }

    var maxMoney = sum
    for (i in m until n) {
        sum -= money[i - m]
        sum += money[i]
        maxMoney = max(sum, maxMoney)
    }

    bw.write("$maxMoney")

    bw.close()
    br.close()
}