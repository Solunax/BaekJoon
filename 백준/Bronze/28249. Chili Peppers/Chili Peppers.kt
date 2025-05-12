import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0

    repeat(br.readLine().toInt()) {
        sum += when (br.readLine()) {
            "Poblano" -> 1500
            "Mirasol" -> 6000
            "Serrano" -> 15500
            "Cayenne" -> 40000
            "Thai" -> 75000
            "Habanero" -> 125000
            else -> 0
        }
    }
    bw.write("$sum")

    bw.close()
    br.close()
}