import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val result = HashSet<String>()
lateinit var card: IntArray
lateinit var visit: BooleanArray
var n = 0

fun main() {
    n = br.readLine().toInt()
    val k = br.readLine().toInt()
    card = IntArray(n)
    visit = BooleanArray(n)

    repeat(n) {
        card[it] = br.readLine().toInt()
    }

    getCards(k, "")
    bw.write("${result.size}")

    bw.close()
    br.close()
}

fun getCards(d: Int, str: String) {
    if (d == 0) {
        result.add(str)
        return
    }

    for (i in 0 until n) {
        if (!visit[i]) {
            visit[i] = true
            getCards(d - 1, str + card[i])
            visit[i] = false
        }
    }
}