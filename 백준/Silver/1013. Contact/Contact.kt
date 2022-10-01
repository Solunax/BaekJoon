import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
       when(br.readLine().matches("(100+1+|01)+".toRegex())){
           true -> bw.write("YES\n")
           false -> bw.write("NO\n")
       }
    }

    bw.close()
    br.close()
}