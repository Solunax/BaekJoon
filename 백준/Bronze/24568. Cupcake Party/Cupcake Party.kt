import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val cake = br.readLine().toInt() * 8 + br.readLine().toInt() * 3
    bw.write("${cake - 28}")

    bw.close()
    br.close()
}