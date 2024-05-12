import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val name = br.readLine()

        if (name.contains("S")) {
            bw.write(name)
        }
    }

    bw.close()
    br.close()
}