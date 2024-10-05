import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val result = IntArray(n)
    val customer = PriorityQueue<Pair<Int, Int>> { o1, o2 ->
        if (o1.second == o2.second) {
            o1.first - o2.first
        } else {
            o1.second - o2.second
        }
    }

    repeat(n) { idx ->
        val st = StringTokenizer(br.readLine())
        repeat(st.nextToken().toInt()) {
            customer.add(Pair(idx, st.nextToken().toInt()))
        }
    }

    val sushi = PriorityQueue<Int>()
    br.readLine().split(" ").map { it.toInt() }.forEach {
        sushi.add(it)
    }

    while (sushi.isNotEmpty()) {
        val s = sushi.poll()

        while (customer.isNotEmpty() && customer.peek().second < s) {
            customer.poll()
        }

        if (customer.isNotEmpty() && customer.peek().second == s) {
            result[customer.poll().first]++
        }
    }
    bw.write(result.joinToString(" "))

    bw.close()
    br.close()
}