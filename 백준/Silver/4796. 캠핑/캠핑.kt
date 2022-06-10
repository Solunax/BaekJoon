import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sequence = 1
    while(true){
        val(l, p, v) = br.readLine().split(" ").map { it.toInt() }
        if(l == 0 && p == 0 && v == 0)
            break

        val result = if(v % p < l)
            l * (v / p) + v % p
        else
            l * (v / p) + l

        bw.write("Case $sequence: $result\n")
        sequence++
    }

    bw.close()
    br.close()
}
