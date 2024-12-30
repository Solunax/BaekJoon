import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, m) = br.readLine().split(" ").map { it.toInt() }
    var count = n

    while (n >= m) {
        n /= m
        count += n
    }
    bw.write("$count")

    bw.close()
    br.close()
}
