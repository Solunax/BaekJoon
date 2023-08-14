import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = LinkedList<Int>()

    repeat(5){
        val input = br.readLine().toInt()

        if(arr.contains(input))
            arr.remove(input)
        else
            arr.add(input)
    }

    bw.write("${arr.first}")

    bw.close()
    br.close()
}