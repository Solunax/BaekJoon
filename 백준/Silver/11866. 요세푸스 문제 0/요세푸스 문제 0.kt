import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var queue = LinkedList<Int>()
val result = LinkedList<Int>()
var count = 1
fun main() {
    val (input, number) = br.readLine().split(" ").map { it.toInt() }
    for(i in 1 .. input)
        queue.add(i)

    while(queue.size > 1){
        if(count != number){
            val temp = queue[0]
            queue.removeAt(0)
            queue.add(temp)
            count++
        }else{
            result.add(queue[0])
            queue.removeAt(0)
            count = 1
        }
    }
    result.add(queue[0])

    bw.write("<")
    for(i in 0 until result.size){
        if(i == result.size - 1)
            bw.write("${result[i]}")
        else
            bw.write("${result[i]}, ")
    }
    bw.write(">")

    br.close()
    bw.close()
}

