import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var reCount = 0

fun main() {
    repeat(br.readLine().toInt()){
        val str = br.readLine()
        bw.write("${recursion(str, 0, str.length - 1, 1)} $reCount\n")
    }

    br.close()
    bw.close()
}

fun recursion(s : String, left : Int, right : Int, count : Int) : Int{
    return if(left >= right){
        reCount = count
        1

    }
    else if(s[left] != s[right]){
        reCount = count
        0
    }
    else
        recursion(s, left + 1, right - 1, count + 1)
}