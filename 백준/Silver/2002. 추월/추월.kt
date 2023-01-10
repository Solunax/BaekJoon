import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val inArr = HashMap<String, Int>()
    val outArr = Array(n){0}

    repeat(n){
        inArr[br.readLine()] = it
    }

    repeat(n){
        outArr[it] = inArr[br.readLine()]!!
    }

    var result = 0
    for(i in 0 until n-1){
        for(j in i+1 until n){
            if(outArr[i] > outArr[j]){
                result++
                break
            }
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}