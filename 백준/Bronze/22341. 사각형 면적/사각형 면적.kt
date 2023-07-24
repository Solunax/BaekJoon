import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, c) = br.readLine().split(" ").map { it.toInt() }
    var nowX = n
    var nowY = n

    for(i in 0 until c){
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        if(nowY < x || nowX < y)
            continue

        if(x * nowY >= nowX * y)
            nowX = x
        else
            nowY = y
    }

    bw.write("${nowX * nowY}")

    bw.close()
    br.close()
}