import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().split("").filter { it.isNotEmpty() }.forEach {
        val c = when(it){
            "E" -> "I"
            "I" -> "E"
            "S" -> "N"
            "N" -> "S"
            "T" -> "F"
            "F" -> "T"
            "J" -> "P"
            "P" -> "J"
            else -> ""
        }
        bw.write(c)
    }

    bw.close()
    br.close()
}