import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    var result = arr[0].toLong()

    for (i in 1 until n) {
        result = (result % m) * (arr[i] % m)
    }
    bw.write("${result % m}")

    bw.close()
    br.close()
}