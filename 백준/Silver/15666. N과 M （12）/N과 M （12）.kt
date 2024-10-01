import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: List<Int>
lateinit var resultArr: IntArray
val sb = StringBuilder()
var n = 0
var m =0

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }
    n = input[0]
    m = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    resultArr = IntArray(m)

    search(0, 0)
    bw.write("$sb")

    bw.close()
    br.close()
}

fun search(start: Int, d: Int) {
    if (d == m) {
        bw.write("${resultArr.joinToString(" ")}\n")
        return
    }

    var last = -1
    for (i in start until n) {
        if (last != arr[i]) {
            last = arr[i]
            resultArr[d] = arr[i]
            search(i, d + 1)
        }
    }
}