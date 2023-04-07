import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var sum = 0
    var min = 101
    input.forEach {
        sum += it
        min = min(min, it)
    }

    when{
        sum >= 100 -> bw.write("OK")
        else -> {
            when(input.indexOf(min)){
                0 -> bw.write("Soongsil")
                1 -> bw.write("Korea")
                2 -> bw.write("Hanyang")
            }
        }
    }


    br.close()
    bw.close()
}