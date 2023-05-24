import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var check = false
    repeat(br.readLine().toInt()){
        if(br.readLine() == "anj")
            check = true
    }

    if(check)
        bw.write("뭐야;")
    else
        bw.write("뭐야?")

    bw.close()
    br.close()
}