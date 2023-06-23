import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var coke = 0
        var n = 1
        br.readLine().reversed().forEach {
            coke += (it - '0') * n
            n *= 2
        }

        bw.write("$coke\n")
    }

    bw.close()
    br.close()
}