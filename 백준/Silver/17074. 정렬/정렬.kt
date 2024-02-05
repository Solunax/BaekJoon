import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    var index = 0
    var count = 0

    for (i in 1 until n) {
        if (arr[i] > arr[i + 1]) {
            index = i
            count++
        }
    }

    val result = when (count) {
        0 -> n
        1 -> {
            if (index == 1) {
                if (arr[index] <= arr[index + 2]) {
                    2
                } else {
                    1
                }
            } else if (index == n - 1) {
                if (arr[index - 1] <= arr[index + 1]) {
                    2
                } else {
                    1
                }
            } else {
                var r = 0
                if (arr[index] <= arr[index + 2]) {
                    r++
                }
                if (arr[index - 1] <= arr[index + 1]) {
                    r++
                }
                r
            }
        }
        else -> 0
    }
    bw.write("$result")

    bw.close()
    br.close()
}