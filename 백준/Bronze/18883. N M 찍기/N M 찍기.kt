import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }

    var num = 1
    for(i in 0 until n){
        for(j in 0 until m){
            if(j == m-1)
                bw.write("${num++}\n")
            else
                bw.write("${num++} ")
        }
    }

    bw.close()
    br.close()
}