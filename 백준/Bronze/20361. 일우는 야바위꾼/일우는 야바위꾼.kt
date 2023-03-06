import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, x, k) = br.readLine().split(" ").map { it.toInt() }
    val cup = Array(n + 1){0}
    cup[x] = 1

    repeat(k){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        if(cup[a] == 1){
            cup[a] = 0
            cup[b] = 1
        }else if(cup[b] == 1){
            cup[a] = 1
            cup[b] = 0
        }
    }

    for(i in 0 .. n){
        if(cup[i] == 1){
            bw.write("$i")
            break
        }
    }

    br.close()
    bw.close()
}