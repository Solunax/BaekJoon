import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val origin = Array(n){""}

    repeat(n){
        origin[it] = br.readLine()
    }

    var check = true
    repeat(n){
        val input = br.readLine()
        val sb = StringBuilder()

        for(i in 0 until m)
            sb.append("${origin[it][i]}${origin[it][i]}")

        if(input != sb.toString())
            check = false
    }

    if(check)
        bw.write("Eyfa")
    else
        bw.write("Not Eyfa")

    bw.close()
    br.close()
}