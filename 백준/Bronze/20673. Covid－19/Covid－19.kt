import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val infect = br.readLine().toInt()
    val admission = br.readLine().toInt()

    val result = if(infect <= 50 && admission <= 10)
        "White"
    else if(admission > 30)
        "Red"
    else
        "Yellow"

    bw.write(result)

    bw.close()
    br.close()
}