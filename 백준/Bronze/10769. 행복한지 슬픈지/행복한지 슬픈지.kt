import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    var happy = 0
    var sad = 0

    for(i in input.indices){
        if(input[i] == ':'){
            if(input[i+1] == '-'){
                if(input[i+2] == ')')
                    happy++
                else if(input[i+2] == '(')
                    sad++
            }
        }
    }

    if(happy == 0 && sad == 0)
        bw.write("none")
    else if(happy == sad)
        bw.write("unsure")
    else if(happy > sad)
        bw.write("happy")
    else
        bw.write("sad")

    bw.close()
    br.close()
}