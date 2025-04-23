import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
lateinit var arr: List<Int>
lateinit var visit: BooleanArray
lateinit var str: IntArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    str = IntArray(m)
    visit = BooleanArray(n)

    search(0, 0)

    bw.close()
    br.close()
}

fun search(idx: Int, d: Int) {
    if (d == m) {
        bw.write("${str.joinToString(" ")}\n")
        return
    }

    for (i in idx until n) {
        if (!visit[i]) {
            visit[i] = true
            str[d] = arr[i]
            search(i, d + 1)
            visit[i] = false
        }
    }
}