import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: IntArray
var result = 0

fun main() {
    val n = br.readLine().toInt()
    val set = HashSet<Int>()
    arr = IntArray(n)

    repeat(n) {
        arr[it] = br.readLine().toInt()
        set.add(arr[it])
    }

    set.forEach {
        getResult(it)
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun getResult(v: Int) {
    var count = 1
    var t = -1

    for (i in arr.indices) {
        if (arr[i] != v) {
            if (t == -1) {
                t = arr[i]
            } else {
                if (arr[i] == t) {
                    count++
                } else {
                    result = max(result, count)
                    t = arr[i]
                    count = 1
                }
            }
        }
    }
    result = max(result, count)
}