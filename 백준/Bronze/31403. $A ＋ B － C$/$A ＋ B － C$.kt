import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine()
    val b = br.readLine()
    val c = br.readLine()

    bw.write("${a.toInt() + b.toInt() - c.toInt()}\n${(a + b).toInt() - c.toInt()}")

    bw.close()
    br.close()
}