import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val basket = Array(n){0}
    repeat(m){
        val (i, j, k) = br.readLine().split(" ").map { it.toInt() }

        for(index in i-1 until j)
            basket[index] = k
    }

    basket.forEach {
        bw.write("$it ")
    }

    br.close()
    bw.close()
}