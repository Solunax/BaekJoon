import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val k = br.readLine().toInt()
    val (a, b, c, d) = br.readLine().split(" ").map { it.toLong() }

    val v1 = a * k + b
    val v2 = c * k + d

    if (v1 == v2) {
        bw.write("Yes $v1")
    } else {
        bw.write("No")
    }

    bw.close()
    br.close()
}