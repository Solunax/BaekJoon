import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){0}.toMutableList()

    for(i in 0 until n)
        array[i] = br.readLine().toInt()

    array.sortDescending()

    var result = 0
    while(array.size > 2){
        result += array.removeFirst() + array.removeFirst()
        array.removeFirst()
    }
    array.forEach {
        result += it
    }

    bw.write("$result")
    bw.close()
    br.close()
}