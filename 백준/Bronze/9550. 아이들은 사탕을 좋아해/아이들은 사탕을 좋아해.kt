import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (_, m) = br.readLine().split(" ").map { it.toInt() }
        var result = 0
        
        br.readLine().split(" ").map { it.toInt() }.forEach {
            result += it / m
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}
