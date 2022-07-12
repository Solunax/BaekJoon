import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val countArray = Array(26){0}

    for(i in 0 until n)
        countArray[br.readLine().first().code - 97]++

    var flag = true
    for(i in countArray.indices){
        if(countArray[i] >= 5){
            bw.write("${(i + 97).toChar()}")
            flag = false
        }
    }

    if(flag)
        bw.write("PREDAJA")

    bw.close()
    br.close()
}