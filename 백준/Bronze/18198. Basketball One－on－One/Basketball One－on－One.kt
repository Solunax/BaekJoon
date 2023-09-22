import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var a = 0
    var b = 0
    val history = br.readLine()
    var score : Int

    for(i in history.indices step 2){
        score = history[i + 1] - '0'

        when(history[i]){
            'A' -> a += score
            'B' -> b += score
        }
    }
    
    if(a > b)
        bw.write("A")
    else
        bw.write("B")

    bw.close()
    br.close()
}