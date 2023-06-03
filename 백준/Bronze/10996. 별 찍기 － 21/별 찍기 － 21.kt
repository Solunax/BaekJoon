import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val p1 = StringBuilder()
    val p2 = StringBuilder()

    for(i in 0 until n){
        if(i % 2 == 0){
            p1.append("*")
            p2.append(" ")
        }else{
            p1.append(" ")
            p2.append("*")
        }
    }

    for(i in 0 until n)
        bw.write("$p1\n$p2\n")

    bw.close()
    br.close()
}