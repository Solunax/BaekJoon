import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    val stackA = Stack<String>()
    val stackB = Stack<String>()

    repeat(case){
        val string = br.readLine().split("").filter { it.isNotEmpty() }

        string.forEach {
            when(it){
                "<" -> {
                    if(stackA.isNotEmpty())
                        stackB.push(stackA.pop())
                }
                ">" -> {
                    if (stackB.isNotEmpty())
                        stackA.push(stackB.pop())
                }
                "-" -> {
                    if (stackA.isNotEmpty())
                        stackA.pop()
                }
                else -> {
                    stackA.push(it)
                }
            }
        }

        repeat(stackA.size){
            stackB.push(stackA.pop())
        }

        repeat(stackB.size){
            bw.write(stackB.pop())
        }
        bw.write("\n")
        stackA.clear()
        stackB.clear()
    }

    bw.close()
    br.close()
}