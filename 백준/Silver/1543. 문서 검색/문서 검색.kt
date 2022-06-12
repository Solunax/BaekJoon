import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var string = br.readLine()
    val input = br.readLine()

    string = string.replace(input, "1")
    val list = string.split("").filter { it.isNotEmpty() }

    bw.write("${list.count { it.equals("1") }}")

    bw.close()
    br.close()
}
