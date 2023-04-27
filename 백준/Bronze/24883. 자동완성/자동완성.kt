import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    if(input == "N" || input == "n")
        bw.write("Naver D2")
    else
        bw.write("Naver Whale")

    bw.close()
    br.close()
}