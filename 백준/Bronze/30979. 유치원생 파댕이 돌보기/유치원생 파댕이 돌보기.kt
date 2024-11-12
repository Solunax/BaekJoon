import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val t = br.readLine().toInt()
    br.readLine()
    val candy = br.readLine().split(" ").sumOf { it.toInt() }

    if (candy >= t) {
        bw.write("Padaeng_i Happy")
    } else {
        bw.write("Padaeng_i Cry")
    }

    bw.close()
    br.close()
}