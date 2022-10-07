import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    if(input.startsWith("0x")){
       bw.write("${Integer.parseInt(input.substring(2), 16)}")
    } else if(input.startsWith("0")){
        bw.write("${Integer.parseInt(input, 8)}")
    } else{
        bw.write(input)
    }


    bw.close()
    br.close()
}