import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var price = br.readLine().toInt()

    repeat(n - 1) {
        price += br.readLine().toInt()
    }
    bw.write("$price")

    bw.close()
    br.close()
}