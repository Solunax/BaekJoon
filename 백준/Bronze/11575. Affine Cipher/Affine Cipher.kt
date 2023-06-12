import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        br.readLine().forEach {
            bw.write("${((a * (it - 'A') + b) % 26 + 'A'.code).toChar()}")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}