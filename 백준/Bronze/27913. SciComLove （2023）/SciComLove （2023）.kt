import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val origin = arrayOf(true, false, false, true, false, false, true, false, false, false)
    val arr = ArrayList<Boolean>()

    for (i in 0 until n / 10) {
        arr += origin
    }

    for (i in 0 until n % 10) {
        arr.add(origin[i])
    }

    var count = arr.count { it }

    repeat(q) {
        val change = br.readLine().toInt() - 1

        if (arr[change]) {
            count--
        } else {
            count++
        }

        arr[change] = !arr[change]

        bw.write("$count\n")
    }

    bw.close()
    br.close()
}