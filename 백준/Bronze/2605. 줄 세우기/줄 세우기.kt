import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val seq = br.readLine().split(" ").map { it.toInt() }
    val array = LinkedList<Int>()

    for(i in 0 until n){
        if(seq[i] == 0)
            array.addLast(i+1)
        else if(seq[i] == i)
            array.addFirst(i+1)
        else
            array.add(array.size - seq[i], i+1)
    }

    array.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}
