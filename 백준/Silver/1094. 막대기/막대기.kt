import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var x = br.readLine().toInt()
    var stick = 64
    var result = 0

    while(x > 0){
        if(stick > x)
            stick /= 2
        else{
            x -= stick
            result++
        }
    }

    bw.write("$result")
    bw.close()
    br.close()
}