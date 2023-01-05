import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0

    for(i in 1 .. br.readLine().toInt()){
        i.toString().forEach {
            if(it == '3' || it == '6' || it == '9')
                result++
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}