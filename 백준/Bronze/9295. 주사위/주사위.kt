import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (a, b) = br.readLine().split(" ").map { v -> v.toInt() }

        bw.write("Case ${it + 1}: ${a + b}\n")
    }

    bw.close()
    br.close()
}