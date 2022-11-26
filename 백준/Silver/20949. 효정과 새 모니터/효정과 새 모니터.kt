import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){Pair(0, 0)}
    repeat(n){
        var sum = 0
        br.readLine().split(" ").map { v -> v.toInt() }.forEach { v ->
            sum += v * v
        }

        arr[it] = Pair(it, sum)
    }

    arr.sortWith{ o1, o2 ->
        if (o1.second == o2.second)
            o1.first - o2.first
        else
            o2.second - o1.second
    }

    arr.forEach {
        bw.write("${it.first+1}\n")
    }

    bw.close()
    br.close()
}