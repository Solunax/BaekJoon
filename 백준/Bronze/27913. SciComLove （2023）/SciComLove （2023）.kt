import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val origin = arrayOf(1, 0, 0, 1, 0, 0, 1, 0, 0, 0)
    val arr = ArrayList<Int>()
    var index = 0
    arr.add(0)

    while (arr.size <= n) {
        arr.add(origin[index++])

        if (index > 9) {
            index = 0
        }
    }

    repeat(q) {
        val change = br.readLine().toInt()

        if (arr[change] == 1) {
            arr[change] = 0
        } else {
            arr[change] = 1
        }

        bw.write("${arr.count { it == 1 }}\n")
    }


    bw.close()
    br.close()
}