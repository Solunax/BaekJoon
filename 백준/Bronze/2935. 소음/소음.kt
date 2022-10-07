import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toBigInteger()
    val operator = br.readLine()
    val b = br.readLine().toBigInteger()

    when(operator){
        "+" -> bw.write("${a+b}")
        "*" -> bw.write("${a*b}")
    }

    bw.close()
    br.close()
}