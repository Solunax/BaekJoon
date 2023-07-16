import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    bw.write("${input.length + input.count { it == ':'} + input.count { it == '_'} * 5}")

    bw.close()
    br.close()
}