import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c, w) = br.readLine().split(" ").map { it.toInt() }
    val pascal = Array(31) { Array(31) { 1 } }

    for (i in 3 .. 30) {
        for (j in 2 until i) {
            pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1]
        }
    }

    var sum = 0
    for (i in 1 ..  w) {
        for (j in 1 .. i) {
            sum += pascal[r + i - 1][c + j - 1]
        }
    }
    bw.write("$sum")

    bw.close()
    br.close()
}