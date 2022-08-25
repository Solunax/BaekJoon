import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val queue = LinkedList<Int>()

    repeat(br.readLine().toInt()){
        val command = br.readLine().split(" ")
        when(command[0]){
            "push" -> {queue.add(command[1].toInt())}
            "pop" -> {
                if(queue.isNotEmpty())
                    bw.write("${queue.pop()}\n")
                else
                    bw.write("-1\n")
            }
            "size" -> {bw.write("${queue.size}\n")}
            "empty" -> {
                if(queue.isEmpty())
                    bw.write("1\n")
                else
                    bw.write("0\n")
            }
            "front" -> {
                if(queue.isNotEmpty())
                    bw.write("${queue.first}\n")
                else
                    bw.write("-1\n")
            }
            "back" -> {
                if(queue.isNotEmpty())
                    bw.write("${queue.last()}\n")
                else
                    bw.write("-1\n")
            }
        }
    }

    bw.close()
    br.close()
}