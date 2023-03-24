import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (time, alcohol) = br.readLine().split(" ").map { it.toInt() }

    var check = true

    if(time !in 12 .. 16)
        check = false

    if(alcohol == 1)
        check = false

    if(check)
        bw.write("320")
    else
        bw.write("280")

    br.close()
    bw.close()
}