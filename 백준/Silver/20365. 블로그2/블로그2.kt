import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val colors = br.readLine().split("").filter { it.isNotEmpty() }
    var red = 0
    var blue = 0

    for(i in 1 until colors.size){
        if(colors[i-1] != colors[i]){
            when(colors[i-1]){
                "R" -> red++
                "B" -> blue++
            }
        }
    }

    if(red > blue)
        bw.write("${red+1}")
    else
        bw.write("${blue+1}")

    bw.close()
    br.close()
}