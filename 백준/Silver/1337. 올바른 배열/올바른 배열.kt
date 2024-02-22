import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = ArrayList<Int>()
    val count = Array(n) { 0 }
    var result = Int.MAX_VALUE

    repeat(n) {
        arr.add(br.readLine().toInt())
    }

    for (i in 0 until n) {
        for (j in 1 until 5) {
            if (!arr.contains(arr[i] + j)) {
                count[i]++
            }
        }
    }

    count.forEach {
        result = min(result, it)
    }
    bw.write("$result")

    bw.close()
    br.close()
}