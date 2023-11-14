import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        bw.write("Material Management ${it + 1}\n")
        val n = br.readLine().toInt()
        val (sizeLimit, weightLimit) = br.readLine().split(" ").map { v -> v.toInt() }

        repeat(n) {
            val (size, weight) = br.readLine().split(" ").map { v -> v.toInt() }
        }

        bw.write("Classification ---- End!\n")
    }

    bw.close()
    br.close()
}