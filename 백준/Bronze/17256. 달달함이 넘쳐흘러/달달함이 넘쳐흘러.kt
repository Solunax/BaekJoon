import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (ax, ay, az) = br.readLine().split(" ").map { it.toInt() }
    val (cx, cy, cz) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${cx - az} ${cy / ay} ${cz - ax}")

    bw.close()
    br.close()
}