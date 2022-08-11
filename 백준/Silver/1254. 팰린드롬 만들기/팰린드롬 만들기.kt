import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var result = input.length

    for(i in input.indices){
        val text = input.substring(i)
        var start = 0
        var end = text.length - 1
        var isPal = true

        while(start <= end){
            if(text[start] != text[end]){
                isPal = false
                break
            }
            start++
            end--
        }

        if(isPal)
            break
        else
            result++
    }

    bw.write("$result")
    bw.close()
    br.close()
}