import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val num = listOf(1, 5, 10, 50)
val visit = Array(1001) { false }
var result = 0
var n = 0

fun main() {
    n = br.readLine().toInt()
    search(0, 0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(count: Int, idx: Int, sum: Int) {
    if (count == n) {
        if (!visit[sum]) {
            result++
            visit[sum] = true
        }
        return
    }

    for (i in idx until 4) {
        search(count + 1, i, sum + num[i])
    }
}