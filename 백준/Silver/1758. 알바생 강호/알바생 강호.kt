import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){0}

    for(i in 0 until  n)
        array[i] = br.readLine().toInt()

    array.sortDescending()

    var result = 0L
    for(i in 0 until  n){
        if(array[i] - i <= 0)
            break

        result += array[i] - i
    }

    bw.write("$result")

    bw.close()
    br.close()
}