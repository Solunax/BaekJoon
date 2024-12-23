import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
lateinit var arr: List<Int>
lateinit var result: BooleanArray

fun main() {
    n = br.readLine().toInt()
    arr = br.readLine().split(" ").map { it.toInt() }
    result = BooleanArray(arr.sum() + 2)

    search(0, 0)

    for (i in 1..result.size) {
        if (!result[i]) {
            bw.write("$i")
            break
        }
    }

    bw.close()
    br.close()
}

fun search(d: Int, sum: Int) {
    if (d == n) {
        result[sum] = true
        return
    }

    search(d + 1, sum + arr[d])
    search(d + 1, sum)
}