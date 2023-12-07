import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val zoo = Array(n + 1) { Array(3) { 0L } }

    zoo[1][0] = 1
    zoo[1][1] = 1
    zoo[1][2] = 1

    for (i in 2 .. n) {
        zoo[i][0] = (zoo[i - 1][0] + zoo[i - 1][1] + zoo[i - 1][2]) % 9901
        zoo[i][1] = (zoo[i - 1][0] + zoo[i - 1][2]) % 9901
        zoo[i][2] = (zoo[i - 1][0] + zoo[i - 1][1]) % 9901
    }

    bw.write("${(zoo[n][0] + zoo[n][1] + zoo[n][2]) % 9901}")

    bw.close()
    br.close()
}