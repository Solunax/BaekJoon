import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var w: List<Int>
lateinit var check: BooleanArray

fun main() {
    br.readLine()
    w = br.readLine().split(" ").map { it.toInt() }
    val sum = w.sum()
    check = BooleanArray(sum + 1)

    getWeight(0, 0)

    var count = 0
    for (i in 1..sum) {
        if (!check[i]) {
            count++
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}

fun getWeight(v: Int, index: Int) {
    if (index < w.size) {
        getWeight(v, index + 1)
        getWeight(v - w[index], index + 1)
        getWeight(v + w[index], index + 1)
    }

    if (index == w.size && v > 0) {
        check[v] = true
    }
}