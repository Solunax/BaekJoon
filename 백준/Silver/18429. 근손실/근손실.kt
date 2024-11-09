import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var k = 0
var result = 0
lateinit var arr: List<Int>
lateinit var visit: BooleanArray
val weight = ArrayList<Int>()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    k = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }
    visit = BooleanArray(n)

    search(0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(d: Int) {
    if (d == n) {
        var total = 500

        for (w in weight) {
            total += w - k

            if (total < 500) {
                return
            }
        }

        result++
        return
    }

    for (i in 0 until n) {
        if (!visit[i]) {
            visit[i] = true
            weight.add(arr[i])
            search(d + 1)
            visit[i] = false
            weight.removeLast()
        }
    }
}