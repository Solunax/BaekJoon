import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val regex = "(w+o+l+f+)+".toRegex()
    var wCount = 0
    var oCount = 0
    var lCount = 0
    var fCount = 0
    var check = true

    for(i in input.indices){
        when(input[i]){
            'w' -> wCount++
            'o' -> oCount++
            'l' -> lCount++
            'f' -> fCount++
        }

        if(i < input.length - 1 && input[i] == 'f' && input[i + 1] == 'w'){
            if(!(wCount == oCount && oCount == lCount && lCount == fCount)){
                check = false
                break
            }
        }
    }

    if(check){
        if(regex.matches(input) && wCount == oCount && oCount == lCount && lCount == fCount)
            bw.write("1")
        else
            bw.write("0")
    }else
        bw.write("0")

    bw.close()
    br.close()
}