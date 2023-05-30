import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val pw = br.readLine()

    bw.write("${pw[0]}")
    for(i in 1 until pw.length){
        if(i % n == 0)
            bw.write("${pw[i]}")
    }

    bw.close()
    br.close()
}