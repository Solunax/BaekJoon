import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val pattern = br.readLine()
    val (start, end) = pattern.split("*").filter { it.isNotEmpty() }

    repeat(n){
        val input = br.readLine()

        if(input.length < pattern.length-1)
            bw.write("NE\n")
        else{
            if(input.substring(0, start.length) == start &&
                input.substring(input.length - end.length) == end)
                bw.write("DA\n")
            else
                bw.write("NE\n")
        }
    }

    bw.close()
    br.close()
}