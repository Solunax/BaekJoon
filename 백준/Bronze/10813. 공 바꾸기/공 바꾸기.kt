import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val basket = ArrayList<Int>()

    for(i in 1 .. n)
        basket.add(i)

    repeat(m){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt()-1 }
        basket[v1] = basket[v2].also { basket[v2] = basket[v1] }
    }

    basket.forEach {
        bw.write("$it ")
    }

    br.close()
    bw.close()
}