import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, x) = br.readLine().split(" ").map { it.toInt() }
    val visitor = br.readLine().split(" ").map { it.toInt() }
    var sum = 0

    repeat(x) {
        sum += visitor[it]
    }

    var maxValue = sum
    var maxCount = 1
    for (i in x until n) {
        sum += visitor[i] - visitor[i - x]

        if (sum > maxValue) {
            maxValue = sum
            maxCount = 1
        } else if (sum == maxValue) {
            maxCount++
        }
    }

    if (maxValue == 0) {
        bw.write("SAD")
    } else {
        bw.write("$maxValue\n$maxCount")
    }

    bw.close()
    br.close()
}