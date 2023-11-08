import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
lateinit var point : List<Int>

fun main() {
    n = br.readLine().toInt()
    br.readLine()
    point = br.readLine().split(" ").map { it.toInt() }

    var start = 1
    var end = n
    var result = 0

    while (start <= end) {
        val center = (start + end) / 2

        if(check(center)){
            end = center - 1
            result = center
        } else {
            start = center + 1
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun check(h : Int) : Boolean {
    var light = 0

    for(i in point.indices){
        if(point[i] - h <= light){
            light = point[i] + h
        } else{
            return false
        }
    }

    return n - light <= 0
}