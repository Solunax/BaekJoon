import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val stack = Stack<Int>()

    repeat(br.readLine().toInt()){
        val command = br.readLine().split(" ").map { it.toInt() }

        when(command[0]){
            1 -> stack.add(command[1])
            2 -> {
                if(stack.isNotEmpty())
                    bw.write("${stack.pop()}\n")
                else
                    bw.write("-1\n")
            }
            3 -> bw.write("${stack.size}\n")
            4 -> {
                if(stack.isEmpty())
                    bw.write("1\n")
                else
                    bw.write("0\n")
            }
            5 -> {
                if(stack.isNotEmpty())
                    bw.write("${stack.peek()}\n")
                else
                    bw.write("-1\n")
            }
        }
    }

    bw.close()
    br.close()
}