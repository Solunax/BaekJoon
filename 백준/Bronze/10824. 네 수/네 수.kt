import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c, d) = br.readLine().split(" ")
    bw.write("${(a+b).toLong() + (c+d).toLong()}")

    bw.close()
    br.close()
}