import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val deck = LinkedList<Int>()
    val order = StringTokenizer(br.readLine().reversed())

    for (i in 1..n) {
        when (order.nextToken().toInt()) {
            1 -> deck.addFirst(i)
            2 -> {
                val temp = deck.removeFirst()
                deck.addFirst(i)
                deck.addFirst(temp)
            }
            3 -> deck.addLast(i)
        }
    }
    bw.write(deck.joinToString(" "))

    bw.close()
    br.close()
}