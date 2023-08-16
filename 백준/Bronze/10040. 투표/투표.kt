import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val price = Array(n){0}
    val score = Array(n){0}

    repeat(n){
        price[it] = br.readLine().toInt()
    }

    repeat(m){
        val maxPrice = br.readLine().toInt()

        for(i in 1 .. n){
            if(price[i - 1] <= maxPrice){
                score[i - 1]++
                break
            }
        }
    }

    for(i in 0 until n){
        if(score.max() == score[i]){
            bw.write("${i + 1}")
            break
        }
    }

    bw.close()
    br.close()
}