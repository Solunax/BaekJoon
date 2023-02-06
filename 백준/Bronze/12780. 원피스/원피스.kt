import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${br.readLine().replace(br.readLine(), "1").count { it == '1' }}")

    br.close()
    bw.close()
}