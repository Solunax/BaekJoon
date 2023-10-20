import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
   val sb = StringBuilder()

    br.readLine().forEach { c ->
        when (c) {
            'a' -> sb.append("4")
            'e' -> sb.append("3")
            'i' -> sb.append("1")
            'o' -> sb.append("0")
            's' -> sb.append("5")
            else -> sb.append(c)
        }
    }
    bw.write("$sb")

    bw.close()
    br.close()
}