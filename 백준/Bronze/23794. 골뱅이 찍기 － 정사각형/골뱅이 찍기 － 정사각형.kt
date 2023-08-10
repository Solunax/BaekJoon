import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
   val n = br.readLine().toInt()

    for(i in 1 .. n + 2){
        if(i == 1 || i == n + 2){
            repeat(n + 2){
                bw.write("@")
            }
        }else{
            bw.write("@")

            repeat(n){
                bw.write(" ")
            }

            bw.write("@")
        }

        bw.write("\n")
    }

    bw.close()
    br.close()
}