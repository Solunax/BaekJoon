import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, p) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }
    val room = BooleanArray(w + 1)
    val partition = ArrayList<Int>()
    partition.add(0)
    partition.add(w)

    for (i in 0 until p) {
        val now = input[i]

        for (v in partition) {
            room[abs(now - v)] = true
        }
        partition.add(now)
    }
    room[w] = true

    for (i in 1..w) {
        if (room[i]) {
            bw.write("$i ")
        }
    }

    bw.close()
    br.close()
}