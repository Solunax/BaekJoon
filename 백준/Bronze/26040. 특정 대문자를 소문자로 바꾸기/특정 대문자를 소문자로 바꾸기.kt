import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    val change = br.readLine().toCharArray()

    str.forEach { c ->
        if(c in change)
            bw.write(c.lowercase())
        else
            bw.write("$c")
    }

    bw.close()
    br.close()
}