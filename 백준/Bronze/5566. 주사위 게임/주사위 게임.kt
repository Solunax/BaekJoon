import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1){0}

    repeat(n){
        map[it + 1] = br.readLine().toInt()
    }

    var result = 0
    var now = 1
    for(i in 0 until m){
        result++

        val move = br.readLine().toInt()
        now += move

        if(now >= n)
            break

        now += map[now]

        if(now < 1)
            now = 1

        if(now >= n)
            break
    }

    bw.write("$result")

    br.close()
    bw.close()
}