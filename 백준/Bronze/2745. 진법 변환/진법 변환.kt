import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, b) = br.readLine().split(" ")
    var result = 0
    var value = 0
    for(i in n.indices){
       value = if(n[i] - 'A' >= 0)
           10 + (n[i] - 'A')
        else
            n[i].digitToInt()

        result += value * b.toDouble().pow(n.length - i - 1).toInt()
    }
    
    bw.write("$result")

    bw.close()
    br.close()
}
