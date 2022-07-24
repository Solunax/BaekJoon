import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val j = br.readLine()
    val doc = br.readLine()

    if(j.contains(doc))
        bw.write("go")
    else
        bw.write("no")

    bw.close()
    br.close()
}