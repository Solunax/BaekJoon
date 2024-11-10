import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = IntArray(80001)
    var sum = 0
    for (i in 1..80000) {
        if (i % 3 == 0 || i % 7 == 0) {
            sum += i
        }
        arr[i] = sum
    }

    br.readLine().split(" ").map { it.toInt() }.forEach {
        bw.write("${arr[it]}\n")
    }

    bw.close()
    br.close()
}