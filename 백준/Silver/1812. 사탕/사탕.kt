import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = IntArray(n + 1)
    val result = IntArray(n + 1)

    repeat(n) {
        arr[it + 1] = br.readLine().toInt()
    }

    var sum = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            sum -= arr[i]
        } else {
            sum += arr[i]
        }
    }
    result[1] = sum / 2

    for (i in 2..n) {
        result[i] = arr[i - 1] - result[i - 1]
    }

    for (i in 1..n) {
        bw.write("${result[i]}\n")
    }

    bw.close()
    br.close()
}