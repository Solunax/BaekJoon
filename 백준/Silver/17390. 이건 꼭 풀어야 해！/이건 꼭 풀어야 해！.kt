import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    val sum = Array(n){0}

    sum[0] = arr[0]
    for(i in 1 until n){
        sum[i] = sum[i-1] + arr[i]
    }

    repeat(q){
        val(start, end) = br.readLine().split(" ").map { it.toInt()-1 }
        when(start){
            0 -> { bw.write("${sum[end]}\n") }
            else -> { bw.write("${sum[end] - sum[start-1]}\n")}
        }
    }

    bw.close()
    br.close()
}