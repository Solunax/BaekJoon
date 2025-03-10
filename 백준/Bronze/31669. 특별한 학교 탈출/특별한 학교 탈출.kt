import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val patrol = Array(n) { CharArray(m) }

    repeat(n) {
        patrol[it] = br.readLine().toCharArray()
    }

    var result = -1
    for (t in 0 until m) {
        var check = true

        for (i in 0 until n) {
            if (patrol[i][t] == 'O') {
                check = false
            }
        }

        if (check) {
            result = t + 1
            break
        }
    }

    if (result == -1) {
        bw.write("ESCAPE FAILED")
    } else {
        bw.write("$result")
    }

    bw.close()
    br.close()
}