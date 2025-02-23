import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var currentLeaf = 0

    if (m == 2) {
        currentLeaf = 1
    }

    var lastLeaf = 0
    for (i in 1 until  n) {
        if (m > currentLeaf) {
            bw.write("0 $i\n")
            currentLeaf++
        } else {
            bw.write("$lastLeaf $i\n")
        }
        lastLeaf = i
    }

    bw.close()
    br.close()
}