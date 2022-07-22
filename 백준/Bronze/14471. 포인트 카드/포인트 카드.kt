import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(m){Pair(0, 0)}

    for(i in 0 until m){
        val input = br.readLine().split(" ").map { it.toInt() }
        array[i] = Pair(input[0], input[1])
    }

    var result = 0
    var count = 0
    array.forEach {
        if(it.first >= n)
            count++
    }

    if(count < m - 1){
        array.sortWith { o1, o2 ->
            o2.first - o1.first
        }

        for(i in 0 until m){
            if(count == m - 1)
                break

            if(array[i].first < n){
                count++
                result += n - array[i].first
            }
        }
    }

    bw.write("$result")
    bw.close()
    br.close()
}