import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var k = 0
var r1 = -1
var r2 = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    k = input[1]
    val arr = ("0 " + br.readLine()).split(" ").map { it.toInt() }.toIntArray()

    selectionSort(arr)
    if (r1 == -1) {
        bw.write("-1")
    } else {
        bw.write("$r1 $r2")
    }

    bw.close()
    br.close()
}

fun selectionSort(arr: IntArray) {
    var swap = 0
    for (last in n downTo 2) {
        var max = Int.MIN_VALUE
        var idx = 0

        for (i in 1..last) {
            if (arr[i] > max) {
                max = arr[i]
                idx = i
            }
        }

        if (last != idx) {
            arr[last] = arr[idx].also { arr[idx] = arr[last] }

            if (++swap == k) {
                r1 = arr[idx]
                r2 = arr[last]
                return
            }
        }
    }
}