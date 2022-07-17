import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){Pair(0, 0)}

    for(i in 0 until n){
        val input = br.readLine().split(" ").map { it.toInt() }
        array[i] = Pair(input[0], input[1])
    }

    array.sortWith { o1, o2 ->
        o2.second - o1.second
    }

    var result = array.first().second
    for(i in array.indices){
        if(array[i].second <= result)
            result = array[i].second - array[i].first
        else
            result -= array[i].first
    }
    if(result > 0)
        bw.write("$result")
    else
        bw.write("-1")
    
    bw.close()
    br.close()
}