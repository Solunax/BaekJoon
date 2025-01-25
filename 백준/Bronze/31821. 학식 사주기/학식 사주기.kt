import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val menu = IntArray(n + 1)

    repeat(n) {
        menu[it + 1] = br.readLine().toInt()
    }

    var sum = 0
    repeat(br.readLine().toInt()) {
        sum += menu[br.readLine().toInt()]
    }

    bw.write("$sum")

    bw.close()
    br.close()
}