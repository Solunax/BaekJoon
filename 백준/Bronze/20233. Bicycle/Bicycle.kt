import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toInt()
    val x = br.readLine().toInt()
    val b = br.readLine().toInt()
    val y = br.readLine().toInt()
    val t = br.readLine().toInt()

    val costA = if (30 >= t) {
        a
    } else {
        a + ((t - 30) * x) * 21
    }

    val costB = if (45 >= t) {
        b
    } else {
        b + ((t - 45) * y) * 21
    }

    bw.write("$costA $costB")

    bw.close()
    br.close()
}