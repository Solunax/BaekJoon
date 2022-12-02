import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine()

    var c = 0
    input.forEach {
        if(it == 'C')
            c++
    }
    val other = n-c

    var res = c/(other+1)
    if(c%(other+1) != 0)
        res += 1

    bw.write("$res")

    br.close()
    bw.close()
}