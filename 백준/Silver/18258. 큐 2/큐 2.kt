import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var queue = LinkedList<Int>()
var top = 0

fun main() {
    val count = br.readLine().toInt()

    for(i in 0 until count){
        val request = br.readLine().split(" ")
        when(request[0]){
            "push" -> {
                queue.add(request[1].toInt())
                top++
            }
            "pop" -> {
                if(top == 0)
                    bw.write("-1\n")
                else{
                    bw.write("${queue[0]}\n")
                    queue.removeAt(0)
                    top--
                }
            }
            "size" -> bw.write("$top\n")
            "empty" -> {
                if(top == 0)
                    bw.write("1\n")
                else
                    bw.write("0\n")
            }
            "front" -> {
                if(top == 0)
                    bw.write("-1\n")
                else
                    bw.write("${queue[0]}\n")
            }
            "back" -> {
                if(top == 0)
                    bw.write("-1\n")
                else
                    bw.write("${queue[top - 1]}\n")
            }
        }
    }
    bw.flush()

    br.close()
    bw.close()
}

