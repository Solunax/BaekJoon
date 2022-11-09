import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (A, B, C) = br.readLine().split(" ").map{ it.toInt() }.sorted()
    val input = br.readLine().split("").filter { it.isNotEmpty() }

    input.forEach {
        when(it){
            "A" -> bw.write("$A ")
            "B" -> bw.write("$B ")
            "C" -> bw.write("$C ")
        }
    }

    bw.close()
    br.close()
}