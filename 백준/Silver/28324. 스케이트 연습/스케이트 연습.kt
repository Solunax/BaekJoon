import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }

    var result = 1L
    var speed = 1

    for (i in n - 2 downTo 0) {
        if (speed < arr[i]) {
            speed++
        } else {
            speed = arr[i]
        }

        result += speed
    }
    bw.write("$result")

    bw.close()
    br.close()
}
