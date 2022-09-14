import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toLong() }

    val result = (a+b) * (a-b)
    bw.write("$result")

    bw.close()
    br.close()
}
