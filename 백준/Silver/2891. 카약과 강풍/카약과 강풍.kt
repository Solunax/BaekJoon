import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, b, _) = br.readLine().split(" ").map { it.toInt() }
    val broken = br.readLine().split(" ").map { it.toInt() }.sorted()
    val team = IntArray(n + 1) { 1 }

    br.readLine().split(" ").map { it.toInt() }.forEach {
        team[it]++
    }

    for (i in 0 until b) {
        team[broken[i]]--
    }

    for (i in 0 until b) {
        val t = broken[i]

        if (t > 1 && team[t] == 0 && team[t - 1] == 2) {
            team[t]++
            team[t - 1]--
        } else if (t != n && team[t] == 0 && team[t + 1] == 2) {
            team[t]++
            team[t + 1]--
        }
    }
    bw.write("${team.count { it == 0 }}")

    bw.close()
    br.close()
}