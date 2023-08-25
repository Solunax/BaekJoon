import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var need : List<Int>
var now = Array(4){0}

fun main() {
    val (s, p) = br.readLine().split(" ").map{ it.toInt() }
    val str = br.readLine()
    need = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    repeat(p){
        when(str[it]){
            'A' -> now[0]++
            'C' -> now[1]++
            'G' -> now[2]++
            'T' -> now[3]++
        }
    }

    if(checkPossibility())
        result++

    var last : Int
    for(i in p until s){
        last = i - p

        when(str[last]){
            'A' -> now[0]--
            'C' -> now[1]--
            'G' -> now[2]--
            'T' -> now[3]--
        }

        when(str[i]){
            'A' -> now[0]++
            'C' -> now[1]++
            'G' -> now[2]++
            'T' -> now[3]++
        }

        if(checkPossibility())
            result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun checkPossibility() : Boolean{
    repeat(4){
        if(need[it] > now[it])
            return false
    }

    return true
}