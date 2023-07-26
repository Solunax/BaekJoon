import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1..n * 5){
        if(i <= n * 4){
            repeat(n){
                bw.write("@")
            }
        }else{
            repeat(n * 5){
                bw.write("@")
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}