import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (endNum, wantNum) = br.readLine().split(" ").map { it.toInt() }
    val wantChar = (wantNum + 48).toChar()
    var result = 0
    
    for(i in 1 .. endNum){
        i.toString().forEach {
            if(it == wantChar)
                result++
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}