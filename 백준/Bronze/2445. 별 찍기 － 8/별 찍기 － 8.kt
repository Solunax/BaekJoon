import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sb = StringBuilder()

    for(i in 0 until  n){
        for(j in 0 until n){
            if(j <= i)
                sb.append("*")
            else
                sb.append(" ")
        }
        bw.write("$sb${sb.reverse()}\n")
        sb.clear()
    }

    for(i in n-1 downTo 0){
        for(j in 0 until n){
            if(i <= j)
                sb.append(" ")
            else
                sb.append("*")
        }
        bw.write("$sb${sb.reverse()}\n")
        sb.clear()
    }

    br.close()
    bw.close()
}