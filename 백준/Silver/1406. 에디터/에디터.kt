import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val string = br.readLine().split("").filter { it.isNotEmpty() }
    val stackA = Stack<String>()
    val stackB = Stack<String>()
    string.forEach {
        stackA.push(it)
    }

    val case = br.readLine().toInt()
    for(i in 0 until case){
        val command = br.readLine().split(" ")
        when(command[0]){
            "L" -> {
                if(stackA.isNotEmpty())
                    stackB.push(stackA.pop())
            }
            "D" -> {
                if(stackB.isNotEmpty())
                    stackA.push(stackB.pop())
            }
            "B" -> {
                if(stackA.isNotEmpty())
                    stackA.pop()
            }
            "P" -> {
                stackA.push(command[1])
            }
        }
    }

    for(i in 0 until stackA.size)
        stackB.push(stackA.pop())

    for(i in 0 until stackB.size)
        bw.write(stackB.pop())

    bw.close()
    br.close()
}