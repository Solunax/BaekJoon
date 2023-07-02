import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var count = 0

    repeat(6){
        if(br.readLine() == "W")
            count++
    }

    if(count >= 5)
        bw.write("1")
    else if(count >= 3)
        bw.write("2")
    else if(count >= 1)
        bw.write("3")
    else
        bw.write("-1")

    bw.close()
    br.close()
}