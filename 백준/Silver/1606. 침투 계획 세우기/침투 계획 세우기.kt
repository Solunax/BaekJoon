import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x, y) = br.readLine().split(" ").map { it.toInt() }
    var result = 1L
    val last = x + y + if (y == 0) 1 else 0

    for (i in 1 until last) {
        result += i * 6
    }
    bw.write("${result + y}")

    bw.close()
    br.close()
}