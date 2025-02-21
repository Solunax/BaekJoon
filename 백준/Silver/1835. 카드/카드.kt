import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val card = IntArray(n)
    val deque = ArrayDeque<Int>()
    deque.addAll(0 until n)

    var idx = 1
    while (deque.isNotEmpty()) {
        for (i in 0 until idx) {
            deque.addLast(deque.removeFirst())
        }
        card[deque.removeFirst()] = idx++
    }
    bw.write(card.joinToString(" "))

    bw.close()
    br.close()
}