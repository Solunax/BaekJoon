import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (k, n, m) = br.readLine().split(" ").map{ it.toInt() }
    val total = k * n

    if(total <= m)
        bw.write("0")
    else
        bw.write("${k * n - m}")

    bw.close()
    br.close()
}