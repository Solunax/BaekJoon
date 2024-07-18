import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }

    if (n == 1) {
        bw.write("${arr.first()}")
    } else {
        val result = ArrayList<Int>()
        result.add(arr[0])
        var sum = arr[0]

        for (i in 1 until n) {
            result.add(arr[i] * (i + 1) - sum)
            sum += result.last()
        }

        bw.write(result.joinToString(" "))
    }

    bw.close()
    br.close()
}