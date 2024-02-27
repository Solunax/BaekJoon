import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val train = Array(n + 1) { 0 }

    repeat(m) {
        val command = br.readLine().split(" ").map { it.toInt() }
        val tNum = command[1]

        train[tNum] = when (command[0]) {
            1 -> train[tNum] or (1 shl command[2])
            2 -> train[tNum] and (1 shl command[2]).inv()
            3 -> (train[tNum] shl 1) and ((1 shl 21) - 1)
            4 -> (train[tNum] shr 1) and (1.inv())
            else -> 0
        }
    }

    val set = HashSet<Int>()

    for (i in 1..n) {
        set.add(train[i])
    }

    bw.write("${set.size}")

    bw.close()
    br.close()
}