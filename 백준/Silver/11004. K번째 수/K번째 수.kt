import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val array = br.readLine().split(" ").map { it.toInt() }.sorted()

    bw.write("${array[k-1]}")
    bw.close()
    br.close()
}