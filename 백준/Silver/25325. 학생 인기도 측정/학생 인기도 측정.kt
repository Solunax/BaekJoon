import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val name = br.readLine().split(" ")
    val score = HashMap<String, Int>()

    repeat(n) {
        score[name[it]] = 0
    }

    repeat(n) {
        br.readLine().split(" ").forEach {
            score[it] = score[it]!! + 1
        }
    }

    val result = score.toList().sortedWith { o1, o2 ->
        if (o1.second != o2.second) {
            o2.second - o1.second
        } else {
            o1.first.compareTo(o2.first)
        }
    }

    repeat(n) {
        bw.write("${result[it].first} ${result[it].second}\n")
    }

    bw.close()
    br.close()
}