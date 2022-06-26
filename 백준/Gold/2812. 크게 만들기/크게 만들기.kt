import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, k) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().toCharArray()

    val deque = ArrayDeque<Char>()

    for(i in input.indices){
        while (k > 0 && deque.isNotEmpty() && deque.last() < input[i]){
            deque.removeLast()
            k--
        }

        deque.addLast(input[i])
    }

    val sb = StringBuilder()
    while (deque.size > k){
        sb.append(deque.removeFirst())
    }
    bw.write("$sb")

    bw.close()
    br.close()
}