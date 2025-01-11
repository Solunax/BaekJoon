import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for (i in 1..n) {
        if (n == 1 + i + i * i) {
            bw.write("$i")
            break
        }
    }

    bw.close()
    br.close()
}