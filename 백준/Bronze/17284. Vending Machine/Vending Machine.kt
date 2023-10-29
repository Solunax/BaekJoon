import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var money = 5000
    val drink = listOf(500, 800, 1000)

    br.readLine().split(" ").map { it.toInt() }.forEach { idx ->
        money -= drink[idx - 1]
    }

    bw.write("$money")

    bw.close()
    br.close()
}