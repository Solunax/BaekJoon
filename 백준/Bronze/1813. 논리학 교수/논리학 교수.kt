import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = IntArray(51)
    var result = -1

    br.readLine().split(" ").map { it.toInt() }.forEach {
        arr[it]++
    }

    for (i in 50 downTo 0) {
        if (arr[i] == i) {
            result = i
            break
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}