import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: IntArray
lateinit var visit: BooleanArray
val result = ArrayList<Int>()

fun main() {
    val n = br.readLine().toInt()
    map = IntArray(n + 1)
    visit = BooleanArray(n + 1)

    repeat(n) { i ->
        map[i + 1] = br.readLine().toInt()
    }

    for (i in 1 .. n) {
        visit[i] = true
        search(i, i)
        visit[i] = false
    }

    bw.write("${result.size}\n")
    result.sorted().forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}

fun search(now: Int, target: Int) {
    if (!visit[map[now]]) {
        visit[map[now]] = true
        search(map[now], target)
        visit[map[now]] = false
    }

    if (map[now] == target) {
        result.add(target)
    }
}