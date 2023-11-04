import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (a, b, x) = br.readLine().split(" ").map { it.toInt() }

        bw.write("${a * (x - 1) + b}\n")
    }

    bw.close()
    br.close()
}