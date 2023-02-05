import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var basket = Array(n){0}

    repeat(n){
        basket[it] = it+1
    }

    repeat(m){
        val (start, end, mid) = br.readLine().split(" ").map { it.toInt()-1 }

        val temp = Array(n){0}
        var index = 0

        for(i in 0 until start){
            temp[i] = basket[i]
            index++
        }
        
        for(i in end+1 until n){
            temp[i] = basket[i]
        }

        for(i in mid .. end){
            temp[index] = basket[i]
            index++
        }

        for(i in start until mid){
            temp[index] = basket[i]
            index++
        }

        basket = temp
    }

    basket.forEach {
        bw.write("$it ")
    }

    br.close()
    bw.close()
}