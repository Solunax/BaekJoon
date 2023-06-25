import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    when(br.readLine()){
        "SONGDO" -> bw.write("HIGHSCHOOL")
        "CODE" -> bw.write("MASTER")
        "2023" -> bw.write("0611")
        "ALGORITHM" -> bw.write("CONTEST")
    }

    bw.close()
    br.close()
}