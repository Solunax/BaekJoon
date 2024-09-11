import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
lateinit var arr: List<Int>
lateinit var result: IntArray
lateinit var visit: BooleanArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    result = IntArray(n)
    visit = BooleanArray(n)

    search(0)

    bw.close()
    br.close()
}

fun search(depth: Int) {
    if (depth == m) {
        repeat(m) {
            bw.write("${result[it]} ")
        }
        bw.write("\n")
    }

    for (i in 0 until n) {
        if (!visit[i]) {
            visit[i] = true
            result[depth] = arr[i]
            search(depth + 1)
            visit[i] = false
        }
    }
}