import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    val c1 = arr[0] * arr[1] * arr[2]
    val c2 = arr[n - 1] * arr[n - 2] * arr[n - 3]
    val c3 = arr[0] * arr[n - 1] * arr[n - 2]
    val c4 = arr[0] * arr[1] * arr[n - 1]
    val c5 = arr[0] * arr[1]
    val c6 = arr[0] * arr[n - 1]
    val c7 = arr[n - 1] * arr[n - 2]
    val g1 = maxOf(c1, c2, c3)
    val g2 = maxOf(c4, c5, c6)
    
    bw.write("${maxOf(g1, g2, c7)}")

    bw.close()
    br.close()
}