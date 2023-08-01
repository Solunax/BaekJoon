import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var (a, b, c, d) = br.readLine().split(" ").map { it.toInt() }

        if(a == 0 && b == 0 && c == 0 && d == 0)
            break

        var count = 0

        while (a != b || b != c || c != d){
            val na = abs(a - b)
            val nb = abs(b - c)
            val nc = abs(c - d)
            val nd = abs(d - a)

            a = na
            b = nb
            c = nc
            d = nd
            count++
        }
        bw.write("$count\n")
    }

    bw.close()
    br.close()
}