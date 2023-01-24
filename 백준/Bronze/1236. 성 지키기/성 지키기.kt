import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) =  br.readLine().split(" ").map{ it.toInt() }
    val castle = Array(n){ Array(m){""} }

    repeat(n){
        castle[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    var row = 0
    for(i in 0 until n){
        var check = false

        for(j in 0 until m){
            if(castle[i][j] == "X"){
                check = true
                break
            }
        }

        if(!check)
            row++

    }

    var column = 0
    for(i in 0 until m){
        var check = false

        for(j in 0 until n){
            if(castle[j][i] == "X"){
                check = true
                break
            }
        }

        if(!check)
            column++
    }

    bw.write("${max(row, column)}")

    br.close()
    bw.close()
}