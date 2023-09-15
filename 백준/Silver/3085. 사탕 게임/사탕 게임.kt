import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var max = 0
lateinit var map : Array<Array<String>>

fun main() {
    n = br.readLine().toInt()

    map = Array(n){ Array(n){""} }

    repeat(n){
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    for(i in 0 until n){
        for(j in 0 until n - 1){
            map[i][j] = map[i][j + 1].also { map[i][j + 1] = map[i][j] }

            check()

            map[i][j + 1] = map[i][j].also { map[i][j] = map[i][j + 1] }
        }
    }

    for(i in 0 until n){
        for(j in 0 until n - 1){
            map[j][i] = map[j + 1][i].also { map[j + 1][i] = map[j][i] }

            check()

            map[j + 1][i] = map[j][i].also { map[j][i] = map[j + 1][i] }
        }
    }

    bw.write("$max")

    bw.close()
    br.close()
}

fun check(){
    for(i in 0 until n){
        var count = 1

        for(j in 0 until n - 1){
            if(map[i][j] == map[i][j + 1])
                count++
            else
                count = 1

            max = max(max, count)
        }
    }

    for(i in 0 until n){
        var count = 1

        for(j in 0 until n - 1){
            if(map[j][i] == map[j + 1][i])
                count++
            else
                count = 1

            max = max(max, count)
        }
    }
}