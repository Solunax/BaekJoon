import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var s = br.readLine().toInt()

        repeat(br.readLine().toInt()){
            val (n, p) = br.readLine().split(" ").map { it.toInt() }

            s += n * p
        }

        bw.write("$s\n")
    }

    bw.close()
    br.close()
}