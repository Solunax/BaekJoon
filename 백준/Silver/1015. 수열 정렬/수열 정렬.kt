import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){ Pair(0, 0) }
    val input = br.readLine().split(" ").map { it.toInt() }

    repeat(n){
        arr[it] = Pair(input[it], it)
    }

    arr.sortWith { o1, o2 ->
        o1.first - o2.first
    }

    for(i in 0 until n){
        bw.write("${arr.indexOf(Pair(input[i], i))} ")
    }

    bw.close()
    br.close()
}