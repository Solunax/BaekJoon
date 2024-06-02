import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = br.readLine().split(" ").map { it.toInt() }.reversed()
    var v1 = 1L
    var v2 = num[0].toLong()
    var temp: Long

    for (i in 1 until n) {
        temp = v2
        v2 = v2 * num[i] + v1
        v1 = temp
    }

    bw.write("${v2 - v1} $v2")

    bw.close()
    br.close()
}