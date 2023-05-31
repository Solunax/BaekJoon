import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    input.forEach { c ->
        var sum = 0
        c.code.toString().forEach { v ->
            sum += v - '0'
        }

        repeat(sum){
            bw.write("$c")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}