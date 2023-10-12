import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val str = br.readLine().split(" ").reversed()

        bw.write("Case #${it + 1}: ")
        str.forEach { v ->
            bw.write("$v ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}