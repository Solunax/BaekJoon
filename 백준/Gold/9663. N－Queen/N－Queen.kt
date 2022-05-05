import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Long.min
import java.lang.Math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().toInt()
val array = Array(input){0}
var result = 0

fun main() {
    queen(0)
    bw.write("$result")
    bw.flush()
    br.close()
    bw.close()
}

fun queen(count:Int){
    if(count == input){
        result++
        return
    }

    for(i in 0 until input){
        array[count] = i
        if(isPossible(count))
            queen(count + 1)
    }
}

fun isPossible(column:Int):Boolean{
    for(i in 0 until column){
        if(array[column] == array[i] || abs(column - i) == abs(array[column] - array[i]))
            return false
    }

    return true
}