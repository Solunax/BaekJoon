import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: List<Int>
lateinit var visit: BooleanArray
lateinit var resultArr: IntArray
lateinit var resultSet: HashSet<String>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    visit = BooleanArray(n)
    resultArr = IntArray(m)
    resultSet = LinkedHashSet<String>()

    search(0, 0)
    resultSet.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}

fun search(start: Int, d: Int) {
    if (d == m) {
        val sb = StringBuilder()

        for (v in resultArr) {
            sb.append("$v ")
        }

        resultSet.add(sb.toString())
        return
    }

    for (i in start until n) {
        resultArr[d] = arr[i]
        search(i, d + 1)
    }
}