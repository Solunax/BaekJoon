import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val truthInput = br.readLine().split(" ").map { it.toInt() }
    val party = Array(m){ ArrayList<Int>() }
    var result = m

    val truth = ArrayList<Int>()
    for (i in 1 until truthInput.size) {
        truth.add(truthInput[i])
    }

    repeat(m) {
        val partyInput = br.readLine().split(" ").map { v -> v.toInt() }

        for (i in 1 until partyInput.size) {
            party[it].add(partyInput[i])
        }
    }

    val queue = LinkedList<Int>()
    val partyCheck = Array(m){false}
    val personCheck = Array(n + 1){false}

    truth.forEach {
        queue.add(it)
        personCheck[it] = true
    }

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in 0 until m) {
            if (partyCheck[i] || !party[i].contains(now)) {
                continue
            }

            for (j in 0 until party[i].size) {
                val next = party[i][j]

                if (personCheck[next]) {
                    continue
                }

                personCheck[next] = true
                queue.add(next)
            }

            partyCheck[i] = true
            result--
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}