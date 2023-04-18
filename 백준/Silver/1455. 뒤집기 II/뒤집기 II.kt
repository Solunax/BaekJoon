import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var coin = emptyArray<Array<Int>>()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    coin = Array(n){ Array(m){0} }

    repeat(n){
        coin[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.map {v -> v.toInt() }.toTypedArray()
    }

    for(x in m - 1 downTo 0){
        for(y in n - 1 downTo 0){
            if(coin[y][x] == 1){
                result++
                flip(x, y)
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun flip(x : Int, y : Int){
    for(i in 0 .. y){
        for(j in 0 .. x){
            if(coin[i][j] == 0)
                coin[i][j] = 1
            else
                coin[i][j] = 0
        }
    }
}