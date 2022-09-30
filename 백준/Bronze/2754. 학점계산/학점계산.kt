import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    when(br.readLine()){
        "A+" -> bw.write("4.3")
        "A0" -> bw.write("4.0")
        "A-" -> bw.write("3.7")
        "B+" -> bw.write("3.3")
        "B0" -> bw.write("3.0")
        "B-" -> bw.write("2.7")
        "C+" -> bw.write("2.3")
        "C0" -> bw.write("2.0")
        "C-" -> bw.write("1.7")
        "D+" -> bw.write("1.3")
        "D0" -> bw.write("1.0")
        "D-" -> bw.write("0.7")
        "F" -> bw.write("0.0")
    }

    bw.close()
    br.close()
}