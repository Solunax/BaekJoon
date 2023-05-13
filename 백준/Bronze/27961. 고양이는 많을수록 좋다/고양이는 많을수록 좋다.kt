import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var n = br.readLine().toLong()
    var result = 0

    while(n > 3){
        if(n % 2 == 0L)
            n /= 2
        else
            n = n / 2 + 1

        result++
    }

    bw.write("${result + n}")

    bw.close()
    br.close()
}