import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val buyer = Array(n) { Pair(0, 0) }

    repeat(n) {
        val (price, cost) = br.readLine().split(" ").map { v -> v.toInt() }
        buyer[it] = Pair(price, cost)
    }

    var maxAdv = 0
    var maxIndex = 0

    for (i in 0 until n) {
        var adv = 0

        for (j in 0 until n) {
            if (buyer[i].first <= buyer[j].first) {
                val money = buyer[i].first - buyer[j].second

                if (money > 0) {
                    adv += money
                }
            }

            if (adv > maxAdv) {
                maxIndex = i
                maxAdv = adv
            } else if (adv == maxAdv) {
                if (buyer[i].first < buyer[maxIndex].first) {
                    maxIndex = i
                }
            }
        }
    }

    if (maxAdv == 0) {
        bw.write("0")
    } else {
        bw.write("${buyer[maxIndex].first}")
    }

    bw.close()
    br.close()
}