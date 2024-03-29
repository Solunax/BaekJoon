import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: List<Int>
var n = 0
var s = 0
var count = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    s = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }

    search(0, 0)

    if (s == 0) {
        bw.write("${count - 1}")
    } else {
        bw.write("$count")
    }

    bw.close()
    br.close()
}

fun search(index: Int, sum: Int) {
    if (index == n) {
        if (sum == s) {
            count++
        }

        return
    }

    search(index + 1, sum + arr[index])
    search(index + 1, sum)
}