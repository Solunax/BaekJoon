import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val data = Array(n){Pair(0, 0)}

    repeat(n){
        val (t, s) = br.readLine().split(" ").map{ v -> v.toInt() }
        data[it] = Pair(t, s)
    }

    data.sortWith{ o1, o2 ->
        o2.second - o1.second
    }

    var result = data[0].second - data[0].first
    for(i in 1 until n){
        if(data[i].second < result)
            result = data[i].second
        result -= data[i].first
    }

    if(result < 0)
        bw.write("-1")
    else
        bw.write("$result")

    bw.close()
    br.close()
}