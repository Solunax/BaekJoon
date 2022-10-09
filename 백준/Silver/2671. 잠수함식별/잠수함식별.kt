import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    val regex = Regex("(100+1+|01)+")
    if(input.matches(regex))
        bw.write("SUBMARINE")
    else
        bw.write("NOISE")


    bw.close()
    br.close()
}