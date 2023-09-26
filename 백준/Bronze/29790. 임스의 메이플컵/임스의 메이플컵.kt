import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, u, l) = br.readLine().split(" ").map { it.toInt() }

    if(n >= 1000){
        if(u >= 8000 || l >= 260)
            bw.write("Very Good")
        else
            bw.write("Good")
    }else
        bw.write("Bad")

    bw.close()
    br.close()
}