import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val queue = PriorityQueue<Int>(reverseOrder())

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val command = st.nextToken().toInt()

        when (command) {
            0 -> {
                if (queue.isNotEmpty()) {
                    bw.write("${queue.poll()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            else -> {
                repeat(command) {
                    queue.add(st.nextToken().toInt())
                }
            }
        }
    }

    bw.close()
    br.close()
}