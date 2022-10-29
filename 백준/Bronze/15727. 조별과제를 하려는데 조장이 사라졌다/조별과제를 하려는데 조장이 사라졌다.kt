import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var l = br.readLine().toInt()

    var result = 0
    while(l != 0){
        if(l >= 5)
            l -= 5
        else
            l = 0
        result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}