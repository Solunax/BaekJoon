import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, l, k) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(n){ Pair(0, 0) }.toMutableList()
    for(i in 0 until n){
        val input = br.readLine().split(" ").map{ it.toInt() }
        array[i] = Pair(input[0], input[1])
    }
    array.sortWith { o1, o2 ->
        if(o1.second == o2.second)
            o1.first - o2.first
        else
            o1.second - o2.second
    }
    var result = 0
    for(i in 0 until n){
        if( l >= array[i].second && k != 0){
            result += 140
            k--
        }else if(l >= array[i].first && k != 0){
            result += 100
            k--
        }

        if(k == 0)
            break
    }

    bw.write("$result")
    bw.close()
    br.close()
}