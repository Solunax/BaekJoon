import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        if (n == 0 && m == 0) {
            break
        }

        val a1 = IntArray(n)
        val a2 = IntArray(m)

        repeat(n) {
            a1[it] = br.readLine().toInt()
        }

        repeat(m) {
            a2[it] = br.readLine().toInt()
        }

        var i = 0
        var j = 0
        var result = 0

        while (i != n && j != m) {
            if (a1[i] == a2[j]) {
                i++
                j++
                result++
            } else if (a1[i] > a2[j]) {
                j++
            } else {
                i++
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}