import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    if (n * 100 >= m) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.close()
    br.close()
}