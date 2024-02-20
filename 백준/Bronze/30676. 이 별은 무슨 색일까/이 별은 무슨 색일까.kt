import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result = when (br.readLine().toInt()) {
        in 380 until 425 -> "Violet"
        in 425 until 450 -> "Indigo"
        in 450 until 495 -> "Blue"
        in 495 until 570 -> "Green"
        in 570 until 590 -> "Yellow"
        in 590 until 620 -> "Orange"
        else -> "Red"
    }

    bw.write(result)

    bw.close()
    br.close()
}