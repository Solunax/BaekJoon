import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${br.readLine().toInt() + br.readLine().toInt() + 3}")

    bw.close()
    br.close()
}