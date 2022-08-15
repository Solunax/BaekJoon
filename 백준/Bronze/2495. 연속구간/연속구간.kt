import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(3){
        val input = br.readLine()
        var result = 1
        var count = 1
        var ch = input[0]

        for(i in 1 until input.length){
            if(input[i] == ch){
                count++
            }else{
                result = max(count, result)
                ch = input[i]
                count = 1
            }
        }
        result = max(count, result)
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}