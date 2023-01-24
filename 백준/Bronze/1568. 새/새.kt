import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var n = br.readLine().toInt()
    var result = 0
    var plus = 1

    while(n != 0){
        result++
        
        if(n < plus)
            plus = 1

        n -= plus
        plus++
    }
    bw.write("$result")

    br.close()
    bw.close()
}