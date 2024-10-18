import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val (cola, beer) = br.readLine().split(" ").map { it.toInt() }
    val drink = (cola / 2) + beer

    if (drink > n) {
        bw.write("$n")
    } else {
        bw.write("$drink")
    }

    bw.close()
    br.close()
}