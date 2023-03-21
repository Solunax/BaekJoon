import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }.sorted()

    if(a + b > c)
        bw.write("${a + b + c}")
    else
        bw.write("${a + b + (a + b - 1)}")

    br.close()
    bw.close()
}