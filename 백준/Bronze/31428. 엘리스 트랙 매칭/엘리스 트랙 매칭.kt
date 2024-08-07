import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val str = br.readLine()
    val t = br.readLine()[0]

    bw.write("${str.count { it == t }}")

    bw.close()
    br.close()
}