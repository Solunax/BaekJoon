import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(n, m) = br.readLine().split(" ").map { it.toInt() }
    val basket = Array(n+1){0}

    for(i in 1 .. n)
        basket[i] = i

    repeat(m){
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        basket.reverse(start, end + 1)
    }

    for(i in 1 .. n)
        bw.write("${basket[i]} ")

    br.close()
    bw.close()
}