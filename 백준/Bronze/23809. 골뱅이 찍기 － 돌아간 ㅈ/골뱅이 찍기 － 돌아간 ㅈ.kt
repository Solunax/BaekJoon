import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val sb = StringBuilder()
var n = 0

fun main() {
    n = br.readLine().toInt()

    drawLine(3)
    drawLine(2)
    drawLine(0)
    drawLine(2)
    drawLine(3)
    
    println(sb.toString())

    bw.close()
    br.close()
}

fun drawLine (space : Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append("@")
        }
        for (j in 0 until n * space) {
            sb.append(" ")
        }
        for (j in 0 until n) {
            sb.append("@")
        }

        if (space == 0) {
            for (j in 0 until n) {
                sb.append("@")
            }
        }
        sb.append("\n")
    }
}