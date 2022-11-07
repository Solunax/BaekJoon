import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val wants = br.readLine().split(" ").map { it.toInt() }
    val seat = Array(101){true}

    var result = 0
    wants.forEach { 
        if(seat[it])
            seat[it] = false
        else
            result++
    }

    bw.write("$result")
    bw.close()
    br.close()
}