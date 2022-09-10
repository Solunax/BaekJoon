import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    var sum = 0
    var result = 0
    var diff = 100
    repeat(10){
        sum += br.readLine().toInt()
        val value = abs(100 - sum)

        if(value <= diff){
            diff = value
            result = sum
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}