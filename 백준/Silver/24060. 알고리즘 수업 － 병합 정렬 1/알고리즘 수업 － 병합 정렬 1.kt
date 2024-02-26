import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: Array<Int>
lateinit var temp: Array<Int>
var count = 0
var k = 0
var result = -1

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    val n = input[0]
    k = input[1]

    arr = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    temp = Array(n) { 0 }

    mergeSort(0, n - 1)
    bw.write("$result")

    bw.close()
    br.close()
}

fun mergeSort(p: Int, r: Int) {
    if (p < r) {
        val q = (p + r) / 2
        mergeSort(p, q)
        mergeSort(q + 1, r)
        merge(p, q, r)
    }
}

fun merge(p: Int, q: Int, r: Int) {
    var i = p
    var j = q + 1
    var t = 0

    while (i <= q && j <= r) {
        if (arr[i] < arr[j]) {
            temp[t++] = arr[i++]
        } else {
            temp[t++] = arr[j++]
        }
    }

    while (i <= q) {
        temp[t++] = arr[i++]
    }

    while (j <= r) {
        temp[t++] = arr[j++]
    }

    i = p
    t = 0
    while (i <= r) {
        count++

        if (count == k) {
            result = temp[t]
            break
        }
        arr[i++] = temp[t++]
    }
}