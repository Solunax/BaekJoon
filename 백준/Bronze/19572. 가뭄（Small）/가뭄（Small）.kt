import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (d1, d2, d3) = br.readLine().split(" ").map { it.toDouble() }
    val sum = (d1 + d2 + d3) / 2

    val a = sum - d3
    val b = sum - d2
    val c = sum - d1

    if (a > 0 && b > 0 && c > 0) {
        bw.write("1\n$a $b $c")
    } else {
        bw.write("-1")
    }

    bw.close()
    br.close()
}