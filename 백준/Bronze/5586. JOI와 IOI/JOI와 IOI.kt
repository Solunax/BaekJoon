import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }

    var index = 0
    var joi = 0
    var ioi = 0
    while(index < input.size-2){
        if(input[index] == "J" && input[index+1] == "O" && input[index+2] == "I"){
            joi++
            index += 2
        }else if(input[index] == "I" && input[index+1] == "O" && input[index+2] == "I"){
            ioi++
            index += 2
        }else
            index++
    }

    bw.write("$joi\n")
    bw.write("$ioi")

    bw.close()
    br.close()
}