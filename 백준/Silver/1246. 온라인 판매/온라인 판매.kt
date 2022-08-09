import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val pay = Array(m){0}

    repeat(m){
        pay[it] = br.readLine().toInt()
    }

    val canSell = if(n >= m)
        m
    else
        n

    var cost = 0
    var max = 0
    pay.sortDescending()
    for(i in 1 .. canSell){
        val temp = pay[i - 1] * i
        if(temp > max){
            max = temp
            cost = pay[i - 1]
        }
    }

    bw.write("$cost $max")
    bw.close()
    br.close()
}