import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val normal = br.readLine()
    var encrypt = br.readLine()

    while (encrypt.length < normal.length){
        encrypt += encrypt
    }

    for(i in normal.indices){
        if(normal[i] == ' ')
            bw.write(" ")
        else{
            val diff = (normal[i].code-'a'.code) - (encrypt[i].code - 'a'.code)

            if(diff > 0)
               bw.write("${(normal[i].code - (encrypt[i].code-'a'.code+1)).toChar()}")
            else
                bw.write("${('z'.code - abs(diff)).toChar()}")
        }
    }

    bw.close()
    br.close()
}