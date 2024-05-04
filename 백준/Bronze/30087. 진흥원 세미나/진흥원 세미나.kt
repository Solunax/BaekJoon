import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val room = when (br.readLine()) {
            "Algorithm" -> "204"
            "DataAnalysis" -> "207"
            "ArtificialIntelligence" -> "302"
            "CyberSecurity" -> "B101"
            "Network" -> "303"
            "Startup" -> "501"
            "TestStrategy" -> "105"
            else -> ""
        }

        bw.write("$room\n")
    }

    bw.close()
    br.close()
}