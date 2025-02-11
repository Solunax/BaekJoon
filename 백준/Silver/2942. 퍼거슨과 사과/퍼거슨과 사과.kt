import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (red, green) = br.readLine().split(" ").map { it.toInt() }
    val n = gcd(red, green)

    for (i in 1..n) {
        if (n % i == 0) {
            bw.write("$i ${red / i} ${green / i}\n")
        }
    }
    
    bw.close()
    br.close()
}

fun gcd(r: Int, g: Int): Int {
    return if (g == 0) {
        r
    } else {
        gcd(g, r % g)
    }
}