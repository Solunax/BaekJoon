import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        bw.write("${23 * br.readLine().toInt()}\n")
    }

    bw.close()
    br.close()
}