import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v = br.readLine().toInt()
    val input = br.readLine().split("").filter { it.isNotEmpty() }
    var a = 0
    var b = 0

    input.forEach {
        if(it == "A")
            a++
        else
            b++
    }

    if(a == b)
        bw.write("Tie")
    else if(a > b)
        bw.write("A")
    else
        bw.write("B")

    bw.close()
    br.close()
}