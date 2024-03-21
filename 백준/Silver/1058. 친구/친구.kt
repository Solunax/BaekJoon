import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
lateinit var people: Array<List<String>>
lateinit var friendCheck: Array<Array<Boolean>>

fun main() {
    n = br.readLine().toInt()
    people = Array(n) { List(n) { " " } }
    friendCheck = Array(n) { Array(n) { false } }

    repeat(n) {
        people[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }
    }

    var maxValue = 0

    for (i in 0 until n) {
        var count = 0

        for (j in 0 until n) {
            if (people[i][j] == "Y") {
                friendCheck[i][j] = true

                for (k in 0 until n) {
                    if (people[j][k] == "Y") {
                        friendCheck[i][k] = true
                    }
                }
            }
        }

        for (j in 0 until n) {
            if (i == j) {
                continue
            }

            if (friendCheck[i][j]) {
                count++
            }
        }

        maxValue = max(maxValue, count)
    }

    bw.write("$maxValue")

    bw.close()
    br.close()
}