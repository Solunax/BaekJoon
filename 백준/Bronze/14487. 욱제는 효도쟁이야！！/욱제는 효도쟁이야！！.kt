import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.sorted()
    var result = 0

    for(i in 0 until n-1)
        result += array[i]

    bw.write("$result")
    bw.close()
    br.close()
}