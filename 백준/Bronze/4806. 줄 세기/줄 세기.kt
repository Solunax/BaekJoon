import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    while(true){
        if(br.readLine() != null)
            result++
        else
            break
    }

    bw.write("$result")

    bw.close()
    br.close()
}