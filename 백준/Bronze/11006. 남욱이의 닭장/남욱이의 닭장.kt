import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (leg, count) = br.readLine().split(" ").map { it.toInt() }
        val cut = count * 2 - leg
        bw.write("$cut ${count - cut}\n")
    }

    bw.close()
    br.close()
}