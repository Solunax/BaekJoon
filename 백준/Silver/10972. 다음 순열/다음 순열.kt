import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: Array<Int>

fun main() {
    val n = br.readLine().toInt()
    arr = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    if (next(n)) {
        bw.write(arr.joinToString(" "))
    } else {
        bw.write("-1")
    }

    bw.close()
    br.close()
}

fun next(n: Int): Boolean {
    var i = n - 1
    while (i > 0 && arr[i - 1] >= arr[i]) {
        i--
    }

    if (i <= 0) {
        return false
    }

    var j = n - 1
    while (arr[j] <= arr[i - 1]) {
        j--
    }

    arr[i - 1] = arr[j].also { arr[j] = arr[i - 1] }
    j = n - 1

    while (i < j) {
        arr[i] = arr[j].also { arr[j] = arr[i] }
        i++
        j--
    }

    return true
}