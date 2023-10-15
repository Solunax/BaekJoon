import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (white, black) = br.readLine().split(" ").map { it.toLong() }

    if(white >= black){
        bw.write("$black")
    } else if(black != 0L){
        bw.write("${white + 1}")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}