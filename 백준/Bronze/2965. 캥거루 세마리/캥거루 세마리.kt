import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    if(b - a < c - b)
        bw.write("${c - b - 1}")
    else
        bw.write("${b - a - 1}")

    bw.close()
    br.close()
}