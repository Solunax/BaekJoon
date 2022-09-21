import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val count = Array(2000001){0}

    repeat(n){
        count[br.readLine().toInt()+1000000]++
    }

    for(i in count.indices){
        for(j in 0 until count[i]){
            bw.write("${i-1000000}\n")
        }
    }

    bw.close()
    br.close()
}