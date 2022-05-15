import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val dequeue = LinkedList<Int>()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val command = br.readLine().split(" ")

        when(command[0]){
            "push_front" -> {dequeue.addFirst(command[1].toInt())}
            "push_back" -> {dequeue.add(command[1].toInt())}
            "pop_front" -> {bw.write("${popFront()}\n")}
            "pop_back" -> {bw.write("${popBack()}\n")}
            "size" -> {bw.write("${dequeue.size}\n")}
            "empty" -> {bw.write("${checkEmpty()}\n")}
            "front" -> {bw.write("${printFront()}\n")}
            "back" -> {bw.write("${printBack()}\n")}
        }
    }

    br.close()
    bw.close()
}

fun popFront():Int{
    return if(dequeue.size == 0)
        -1
    else
        dequeue.removeFirst()
}

fun popBack():Int{
    return if(dequeue.size == 0)
        -1
    else
        dequeue.removeLast()
}

fun checkEmpty():Int{
    return if(dequeue.size == 0)
        1
    else
        0
}

fun printFront():Int{
    return if(dequeue.size == 0)
        -1
    else
        dequeue.first
}

fun printBack():Int{
    return if(dequeue.size == 0)
        -1
    else
        dequeue.last
}