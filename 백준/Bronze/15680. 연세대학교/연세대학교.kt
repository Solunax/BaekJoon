import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    when (br.readLine()){
        "0" -> bw.write("YONSEI")
        "1" -> bw.write("Leading the Way to the Future")
    }

    bw.close()
    br.close()
}
