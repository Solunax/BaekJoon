import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = Array(n + 1) { ArrayList<Int>() }

    repeat(n - 1) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        map[a].add(b)
        map[b].add(a)
    }

    repeat(br.readLine().toInt()) {
        val (t, k) = br.readLine().split(" ").map { it.toInt() }

        when (t) {
            1 -> {
                if (map[k].size >= 2) {
                    bw.write("yes\n")
                } else {
                    bw.write("no\n")
                }
            }
            2 -> bw.write("yes\n")
        }
    }

    bw.close()
    br.close()
}