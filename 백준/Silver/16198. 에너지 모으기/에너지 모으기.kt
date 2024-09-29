import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
lateinit var arr: ArrayList<Int>
var result = 0

fun main() {
    n = br.readLine().toInt()
    arr = ArrayList()

    br.readLine().split(" ").map { it.toInt() }.forEach {
        arr.add(it)
    }

    search(0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(energy: Int) {
    if (arr.size == 2) {
        result = max(result, energy)
        return
    }

    for (i in 1 until arr.size - 1) {
        val tempEnergy = arr[i - 1] * arr[i + 1]
        val temp = arr.removeAt(i)
        search(energy + tempEnergy)
        arr.add(i, temp)
    }
}