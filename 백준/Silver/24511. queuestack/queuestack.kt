import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val type = br.readLine().split(" ").map { it.toInt() }
    var st = StringTokenizer(br.readLine())
    val deque = ArrayDeque<Int>()

    repeat(n) {
        val t = st.nextToken().toInt()
        if (type[it] == 0) {
            deque.addLast(t)
        }
    }

    val m = br.readLine().toInt()
    st = StringTokenizer(br.readLine())
    repeat(m) {
        deque.addFirst(st.nextToken().toInt())
        bw.write("${deque.removeLast()} ")
    }

    bw.close()
    br.close()
}