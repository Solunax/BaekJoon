import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var index = 1
    while(true){
        val input = br.readLine()

        if(input == "0")
            break

        val (r, w, h) = input.split(" ").map { it.toDouble() }
        val pizza = sqrt(w.pow(2) + h.pow(2))
        
        if(r * 2 >= pizza)
            bw.write("Pizza $index fits on the table.\n")
        else
            bw.write("Pizza $index does not fit on the table.\n")

        index++
    }

    br.close()
    bw.close()
}