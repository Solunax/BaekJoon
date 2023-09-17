import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${br.readLine().replace("DKSH", "1").count { it == '1' }}")

    bw.close()
    br.close()
}