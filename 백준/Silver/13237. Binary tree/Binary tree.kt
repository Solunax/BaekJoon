import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val node = Array(21) { ArrayList<Int>() }
val result = Array(21) { 0 }

fun main() {
    val n = br.readLine().trim().toInt()
    var root = 0

    for (i in 1..n) {
        val v = br.readLine().trim().toInt()

        if (v == -1) {
            root = i
        } else {
            node[v].add(i)
        }
    }

    search(root)

    for (i in 1..n) {
        bw.write("${result[i]}\n")
    }

    bw.close()
    br.close()
}

fun search(now: Int) {
    for (v in node[now]) {
        result[v] = result[now] + 1
        search(v)
    }
}