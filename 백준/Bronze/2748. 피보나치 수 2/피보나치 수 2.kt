import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fibo = Array(n + 1) {0L}
    fibo[1] = 1
    
    if(n > 1) {
        fibo[2] = 1
    }

    for (i in 3..n){
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }
    bw.write("${fibo[n]}")

    bw.close()
    br.close()
}