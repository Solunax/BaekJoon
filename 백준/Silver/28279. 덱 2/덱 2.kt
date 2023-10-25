import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val deque = ArrayDeque<Int>()

    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map { it.toInt() }

        when(input[0]){
            1 -> deque.addFirst(input[1])
            2 -> deque.addLast(input[1])
            3 -> {
                if(deque.isNotEmpty()){
                    bw.write("${deque.removeFirst()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            4 -> {
                if(deque.isNotEmpty()){
                    bw.write("${deque.removeLast()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            5 -> bw.write("${deque.size}\n")
            6 -> {
                if(deque.isNotEmpty()){
                    bw.write("0\n")
                } else {
                    bw.write("1\n")
                }
            }
            7 -> {
                if(deque.isNotEmpty()){
                    bw.write("${deque.first()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            8 -> {
                if(deque.isNotEmpty()){
                    bw.write("${deque.last()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
        }
    }

    bw.close()
    br.close()
}