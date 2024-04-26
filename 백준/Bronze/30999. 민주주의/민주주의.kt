import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    var yes: Int
    var no: Int

    repeat(n) {
        val vote = br.readLine()
        yes = vote.count { it == 'O' }
        no = vote.count { it == 'X' }

        if (yes > no) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}