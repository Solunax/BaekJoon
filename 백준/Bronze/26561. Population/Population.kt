import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        var (p, t) = br.readLine().split(" ").map { it.toInt() }
        p += t / 4
        p -= t / 7
        
        bw.write("$p\n")
    }

    bw.close()
    br.close()
}