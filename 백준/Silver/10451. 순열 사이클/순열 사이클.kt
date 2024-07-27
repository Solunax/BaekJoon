import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: IntArray
lateinit var visit: BooleanArray

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var result = 0
        map = IntArray(n + 1)
        visit = BooleanArray(n + 1)
        map = intArrayOf(0) + br.readLine().split(" ").map { it.toInt() }

        for (i in 1 .. n) {
            if (!visit[i]) {
                result++
                search(i)
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}

fun search(now: Int) {
    visit[now] = true

    if (!visit[map[now]]) {
        search(map[now])
    }
}