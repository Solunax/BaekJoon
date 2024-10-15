import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()
    var count0 = arr.count { it == "0" } / 2
    var count1 = arr.count { it == "1" } / 2

    for (i in arr.indices) {
        if (count1 == 0) {
            break
        }

        if (arr[i] == "1") {
            arr[i] = "-1"
            count1--
        }
    }

    for (i in arr.size - 1 downTo 0) {
        if (count0 == 0) {
            break
        }

        if (arr[i] == "0") {
            arr[i] = "-1"
            count0--
        }
    }

    val sb = StringBuilder()
    for (i in arr.indices) {
        if (arr[i] != "-1") {
            sb.append(arr[i])
        }
    }
    bw.write("$sb")

    bw.close()
    br.close()
}