import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val score = br.readLine().split(" ").map{ it.toInt() }

    val result = when(score.indexOf(br.readLine().toInt()) + 1){
        in 1 .. 5 -> "A+"
        in 6 .. 15 -> "A0"
        in 16 .. 30 -> "B+"
        in 31 .. 35 -> "B0"
        in 36 .. 45 -> "C+"
        in 46 .. 48 -> "C0"
        else -> "F"
    }

    bw.write(result)

    br.close()
    bw.close()
}