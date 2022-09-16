import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val half = input.length / 2
    var v1 = 0
    var v2 = 0

    for(i in input.indices){
        if(i < half)
            v1 += input[i] - '0'
        else
            v2 += input[i] - '0'
    }

    if(v1 == v2)
        bw.write("LUCKY")
    else
        bw.write("READY")


    bw.close()
    br.close()
}