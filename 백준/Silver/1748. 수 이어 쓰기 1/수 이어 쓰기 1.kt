import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0
    var plus = 1
    var p = 10

    for(i in 1 .. n){
        if(i % p == 0){
            plus++
            p *= 10
        }
        result += plus
    }
    
    bw.write("$result")
    bw.close()
    br.close()
}