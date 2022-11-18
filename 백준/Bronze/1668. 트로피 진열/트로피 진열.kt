import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val trophy = Array(n){0}

    repeat(n){
        trophy[it] = br.readLine().toInt()
    }

    var result = 0
    var max = 0
    for(i in 0 until n){
        if(max < trophy[i]){
            max = trophy[i]
            result++
        }
    }
    bw.write("$result\n")

    result = 0
    max = 0
    for(i in n-1 downTo 0){
        if(max < trophy[i]){
            max = trophy[i]
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}