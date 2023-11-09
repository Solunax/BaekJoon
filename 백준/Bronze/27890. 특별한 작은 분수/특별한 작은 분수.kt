import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (x, t) = br.readLine().split(" ").map{ it.toInt() }

    for (i in 1 .. t) {
        x = if (x % 2 == 0){
            (x / 2) xor 6
        } else {
            (x * 2) xor 6
        }
    }
    bw.write("$x")

    bw.close()
    br.close()
}