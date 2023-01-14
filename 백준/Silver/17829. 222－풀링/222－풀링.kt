import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var n = br.readLine().toInt()
var map = Array(n){Array(n){0}}

fun main() {
    repeat(n){
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    while(n != 1){
        pooling()
    }
    bw.write("${map[0][0]}")

    br.close()
    bw.close()
}

fun pooling(){
    val newMap = Array(n/2){Array(n/2){0}}

    for(i in 0 until n step 2 ){
        for(j in 0 until n step 2){
            val arr = listOf(map[i][j], map[i+1][j], map[i][j+1], map[i+1][j+1])
            newMap[i/2][j/2] = arr.sorted()[2]
        }
    }

    map = newMap
    n /= 2
}
