import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    when(br.readLine()){
        "NLCS" -> bw.write("North London Collegiate School")
        "BHA" -> bw.write("Branksome Hall Asia")
        "KIS" -> bw.write("Korea International School")
        "SJA" -> bw.write("St. Johnsbury Academy")
    }

    bw.close()
    br.close()
}