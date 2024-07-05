import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }

    br.readLine().split(" ").map { it.toInt() }.forEach { score ->
        bw.write("${gradeCheck(score * 100 / n)} ")
    }

    bw.close()
    br.close()
}

fun gradeCheck(point: Int): Int {
    return when (point) {
        in 0..4 -> 1
        in 5..11 -> 2
        in 12..23 -> 3
        in 24..40 -> 4
        in 41..60 -> 5
        in 61..77 -> 6
        in 78..89 -> 7
        in 90..96 -> 8
        else -> 9
    }
}