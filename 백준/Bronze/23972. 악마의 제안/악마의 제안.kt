import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (k, n) = br.readLine().split(" ").map { it.toLong() }
    var money = -1L

    if (n != 1L) {
        money = (k * n) / (n - 1L)

        if ((k * n) % (n - 1L) != 0L) {
            money += 1
        }
    }
    bw.write("$money")

    bw.close()
    br.close()
}