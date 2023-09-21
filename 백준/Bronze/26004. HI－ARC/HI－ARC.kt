import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val hiarc = Array(5){0}
    br.readLine()
    br.readLine().forEach {
        when(it){
            'H' -> hiarc[0]++
            'I' -> hiarc[1]++
            'A' -> hiarc[2]++
            'R' -> hiarc[3]++
            'C' -> hiarc[4]++
        }
    }

    var result = Int.MAX_VALUE
    hiarc.forEach {
        result = min(result, it)
    }

    bw.write("$result")

    bw.close()
    br.close()
}