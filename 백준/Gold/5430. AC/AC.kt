import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val dequeue = LinkedList<Int>()
        val command = br.readLine().split("").filter { it.isNotEmpty() }
        val numbers = br.readLine().toInt()
        val member = br.readLine().drop(1).dropLast(1).split(",").filter { it.isNotEmpty() }.map { it.toInt() }

        if(numbers < command.count{ it == "D"}){
            bw.write("error\n")
            continue
        }

        dequeue.addAll(member)

        var isReverse = false
        for(i in command.indices){
            if(command[i] == "R")
                isReverse = !isReverse
            else{
                if(!isReverse)
                    dequeue.removeFirst()
                else
                    dequeue.removeLast()
            }
        }

        bw.write("[")
        if(dequeue.size != 0){
            if(!isReverse){
                bw.write(dequeue.joinToString(","))
            }else{
                dequeue.reverse()
                bw.write(dequeue.joinToString(","))
            }
        }
        bw.write("]\n")
    }

    br.close()
    bw.close()
}