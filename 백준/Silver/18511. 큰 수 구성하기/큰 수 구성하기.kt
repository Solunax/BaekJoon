import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var k = 0
var result = 0
lateinit var arr: List<Int>

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    k = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }.sorted()

    search(0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(num: Int) {
    if (num > n) {
        return
    }

    result = max(result, num)

    for (i in k - 1 downTo 0) {
        search(num * 10 + arr[i])
    }
}