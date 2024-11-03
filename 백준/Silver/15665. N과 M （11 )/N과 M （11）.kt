import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: List<Int>
lateinit var visit: BooleanArray
lateinit var resultArr: IntArray
lateinit var resultSet: LinkedHashSet<String>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    visit = BooleanArray(n)
    resultArr = IntArray(m)
    resultSet = LinkedHashSet()

    search(0)
    resultSet.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}

fun search(d: Int) {
    if (d == m) {
        resultSet.add(resultArr.joinToString(" "))
        return
    }

    for (i in 0 until n) {
        resultArr[d] = arr[i]
        search(d + 1)
    }
}