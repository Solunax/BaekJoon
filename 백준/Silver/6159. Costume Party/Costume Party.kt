import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, s) = br.readLine().split(" ").map { it.toInt() }
    val cow = IntArray(n)

    repeat(n) {
        cow[it] = br.readLine().toInt()
    }
    cow.sort()

    var result = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if (cow[i] + cow[j] <= s) {
                result++
            } else {
                break
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}