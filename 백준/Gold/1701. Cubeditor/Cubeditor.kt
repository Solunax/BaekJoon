import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var max = 0
    for(i in input.indices){
        max = max(getResult(input.substring(i)), max)
    }
    bw.write("$max")

    br.close()
    bw.close()
}

fun getResult(pattern : String) : Int{
    val arr = Array(pattern.length){0}

    var index = 0
    for(i in 1 until pattern.length){
        while(index > 0 && pattern[i] != pattern[index]){
            index = arr[index-1]
        }

        if(pattern[i] == pattern[index]){
            index++
            arr[i] = index
        }
    }

    var max = 0
    arr.forEach {
        if(max < it)
            max = it
    }

    return max
}