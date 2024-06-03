import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (ur, tr, uo, to) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${ur * 56 + tr * 24 + uo * 14 + to * 6}")

    bw.close()
    br.close()
}