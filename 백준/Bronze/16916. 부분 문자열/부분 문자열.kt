import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val origin = br.readLine()
    val pattern = br.readLine()

    bw.write("${kmp(origin, pattern)}")
    br.close()
    bw.close()
}

fun kmp(origin : String, pattern : String) : Int{
    val arr = makeTable(pattern)

    var index = 0
    for(i in origin.indices){
        while (index > 0 && origin[i] != pattern[index]){
            index = arr[index-1]
        }

        if(origin[i] == pattern[index]){
            if(index == pattern.length-1){
                return 1
            }else
                index += 1
        }
    }

    return 0
}

fun makeTable(pattern : String) : Array<Int>{
    val n = pattern.length
    val arr = Array(n){0}

    var index = 0
    for(i in 1 until n){
        while(index > 0 && pattern[i] != pattern[index]){
            index = arr[index-1]
        }

        if(pattern[i] == pattern[index]){
            index += 1
            arr[i] = index
        }
    }

    return arr
}