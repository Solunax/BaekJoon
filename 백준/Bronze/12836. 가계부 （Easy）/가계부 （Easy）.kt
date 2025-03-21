import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val arr = LongArray(n + 1)

    repeat(q) {
        val (command, v1, v2) = br.readLine().split(" ").map { it.toInt() }

        when (command) {
            1 -> arr[v1] = arr[v1] + v2
            2 -> {
                var sum = 0L
                for (i in v1..v2) {
                    sum += arr[i]
                }
                bw.write("$sum\n")
            }
        }
    }

    bw.close()
    br.close()
}