import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val fret = Array<Stack<Int>>(7) { Stack() }
    var move = 0

    repeat(n) {
        val (m, f) = br.readLine().split(" ").map { it.toInt() }

        while (fret[m].isNotEmpty() && fret[m].peek() > f) {
            fret[m].pop()
            move++
        }

        if (fret[m].isEmpty() || fret[m].peek() < f) {
            fret[m].push(f)
            move++
        }
    }
    bw.write("$move")

    bw.close()
    br.close()
}