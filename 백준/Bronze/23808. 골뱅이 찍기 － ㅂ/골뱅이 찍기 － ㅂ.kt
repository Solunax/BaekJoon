import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. 5 * n){
        if(i <=  2 * n || i in 2 * n + n + 1 .. 5 * n - n){
            repeat(5 * n){
                when(it){
                    in 0 until n -> bw.write("@")
                    in 5 * n - n until  5 * n -> bw.write("@")
                    else -> bw.write(" ")
                }
            }
        }else{
            repeat(5 * n){
                bw.write("@")
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}