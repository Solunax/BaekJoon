import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val cup = arrayOf(1, 0, 0)

    br.readLine().split("").filter { it.isNotEmpty() }.forEach {
        when(it){
            "A" -> {cup[0] = cup[1].also { cup[1] = cup[0] }}
            "B" -> {cup[1] = cup[2].also { cup[2] = cup[1] }}
            "C" -> {cup[0] = cup[2].also { cup[2] = cup[0] }}
        }
    }

    bw.write("${cup.indexOf(1)+1}")

    bw.close()
    br.close()
}