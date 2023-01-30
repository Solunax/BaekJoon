import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map{ it.toInt() }

    val front = Array(n){" "}
    val back = Array(n){" "}

    for(i in 0 until n){
        if(i < m)
            front[i] = "O"
        else
            front[i] = "X"
    }

    for(i in 0 until n){
        if(i < k)
            back[i] = "O"
        else
            back[i] = "X"
    }

    var result = 0
    repeat(n){
        if(front[it] == back[it])
            result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}

