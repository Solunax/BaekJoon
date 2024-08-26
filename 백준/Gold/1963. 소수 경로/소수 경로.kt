import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val prime = BooleanArray(10000) { true }
lateinit var map: IntArray
lateinit var visit: BooleanArray

fun main() {
    getPrime()
    repeat(br.readLine().toInt()) {
        val (n, want) = br.readLine().split(" ").map { it.toInt() }
        map = IntArray(10000)
        visit = BooleanArray(10000)

        val result = search(n, want)
        bw.write("$result\n")
    }


    bw.close()
    br.close()
}

fun getPrime() {
    prime[0] = false
    prime[1] = false

    for (i in 2 until 10000) {
        for (j in i * 2 until 10000 step i) {
            prime[j] = false
        }
    }
}

fun changeNumber(number: Int, index: Int, v: Int): Int {
    val sb = StringBuilder(number.toString())
    sb.setCharAt(index, (v.toChar().code + '0'.code).toChar())
    return sb.toString().toInt()
}

fun search(n: Int, want: Int): Int {
    val queue = LinkedList<NumberData>()
    queue.add(NumberData(n, 0))
    visit[n] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.number == want) {
            return now.count
        }

        for (i in 0 until 4) {
            for (j in 0..9) {
                if (i == 0 && j == 0) {
                    continue
                }
                val temp = changeNumber(now.number, i, j)

                if (prime[temp] && !visit[temp]) {
                    queue.add(NumberData(temp, now.count + 1))
                    visit[temp] = true
                }
            }
        }
    }

    return 0
}

data class NumberData(val number: Int, val count: Int)