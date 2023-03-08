import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
   repeat(br.readLine().toInt()){
       val (a, b) = br.readLine().split(" ").map { it.toInt() }
       var v = 1

       for(i in 0 until  b){
           v = (v * a) % 10

           if(v == 0)
               v = 10
       }

       bw.write("$v\n")
   }

    br.close()
    bw.close()
}