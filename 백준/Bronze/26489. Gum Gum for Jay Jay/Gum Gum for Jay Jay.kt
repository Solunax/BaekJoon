import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var count = 0

    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        if(input == "gum gum for jay jay")
            count++
    }
    bw.write("$count")

    bw.close()
    br.close()
}