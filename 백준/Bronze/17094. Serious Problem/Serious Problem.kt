import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var e = 0
    var two = 0

    br.readLine()
    br.readLine().forEach {
        when(it){
            '2' -> two++
            'e' -> e++
        }
    }

    if(e == two)
        bw.write("yee")
    else if(e > two)
        bw.write("e")
    else
        bw.write("2")

    bw.close()
    br.close()
}