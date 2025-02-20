import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    repeat(n) {
        br.readLine()
    }

    if (n >= 8) {
        bw.write("satisfactory")
    } else {
        bw.write("unsatisfactory")
    }

    bw.close()
    br.close()
}