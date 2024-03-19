import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()
val visit = Array(n) { false }
val result = Array(n) { 0L }
var isPossible = false
lateinit var arr: List<Long>

fun main() {
    arr = br.readLine().split(" ").map { it.toLong() }.sorted()

    for (i in arr.indices) {
        findNumber(i, 0)
    }

    bw.write(result.joinToString(" "))

    bw.close()
    br.close()
}

fun findNumber(index: Int, count: Int) {
    if (isPossible) {
        return
    }

    if (!visit[index]) {
        visit[index] = true
        result[count] = arr[index]

        if (count == n - 1) {
            isPossible = true
            return
        }

        if (result[count] % 3 == 0L) {
            for (i in index - 1 downTo 0) {
                if (arr[i] == result[count] / 3) {
                    findNumber(i, count + 1)
                    break
                }
            }
        }

        for (i in index + 1 until n) {
            if (arr[i] == result[count] * 2) {
                findNumber(i, count + 1)
                break
            }
        }

        visit[index] = false
    }
}