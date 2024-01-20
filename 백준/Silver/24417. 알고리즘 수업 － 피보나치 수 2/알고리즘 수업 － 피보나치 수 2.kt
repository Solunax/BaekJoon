import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val div = 1000000007
    var v1 = 1L
    var v2 = 1L

    for (i in 2 .. n) {
        val temp = (v1 + v2) % div
        v1 = v2.also { v2 = temp }
    }
    bw.write("$v1 ${n - 2}")

    bw.close()
    br.close()
}