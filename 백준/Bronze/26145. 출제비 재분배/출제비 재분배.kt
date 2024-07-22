import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val money = br.readLine().split(" ").map { it.toInt() }
    val result = money.toIntArray() + IntArray(m)
    
    for (i in 0 until n) {
        val divide = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until n + m) {
            result[i] -= divide[j]
            result[j] += divide[j]
        }
    }
    bw.write(result.joinToString(" "))

    bw.close()
    br.close()
}