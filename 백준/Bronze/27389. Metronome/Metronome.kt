import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("%.2f".format(br.readLine().toDouble() / 4))

    bw.close()
    br.close()
}