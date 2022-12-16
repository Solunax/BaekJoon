import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("-")
    input.forEach {
        bw.write("${it[0]}")
    }

    br.close()
    bw.close()
}