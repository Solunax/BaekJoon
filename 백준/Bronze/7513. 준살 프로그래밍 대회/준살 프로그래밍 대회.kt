import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) { idx ->
        val m = br.readLine().toInt()
        val pw = Array(m) { "" }

        repeat(m) {
            pw[it] = br.readLine()
        }

        bw.write("Scenario #${idx + 1}:\n")
        val n = br.readLine().toInt()
        repeat(n) {
            val input = StringTokenizer(br.readLine())

            repeat(input.nextToken().toInt()) {
                bw.write(pw[input.nextToken().toInt()])
            }
            bw.write("\n")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}