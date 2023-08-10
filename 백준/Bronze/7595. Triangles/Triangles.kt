import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
   while(true){
       val n = br.readLine().toInt()

       if(n == 0)
           break

       for(i in 1 .. n){
           repeat(i){
               bw.write("*")
           }
           bw.write("\n")
       }
   }

    bw.close()
    br.close()
}