import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n){0}

    repeat(q){
        val (start, distance) = br.readLine().split(" ").map { it.toInt() }

        for(i in start - 1 until n step distance)
            arr[i] = 1
    }

    var count = 0
    arr.forEach {
        if(it == 0)
            count++
    }
    bw.write("$count")

    bw.close()
    br.close()
}