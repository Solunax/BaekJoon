import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){List(2){0} }

    for(i in 0 until n)
        array[i] = br.readLine().split(" ").map { it.toInt() }

    array.sortWith{o1, o2 ->
        o2.last() - o1.last()
    }

    var result = array[0].last()
    for(i in 0 until n){
        if(array[i].last() <= result)
            result = array[i].last() - array[i].first()
        else
            result -= array[i].first()
    }

    bw.write("$result")

    bw.close()
    br.close()
}
