import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0

    for(i in 1 .. n){
        for(j in i .. n){
            if(i * j <= n)
                result++
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}