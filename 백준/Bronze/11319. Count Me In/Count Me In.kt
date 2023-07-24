import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('A', 'E', 'I', 'O', 'U')

    repeat(br.readLine().toInt()){
        var vowelCount = 0
        var consonantsCount = 0

        br.readLine().uppercase().forEach { c ->
            if(c in vowel)
                vowelCount++
            else if(c != ' ')
                consonantsCount++
        }

        bw.write("$consonantsCount $vowelCount\n")
    }

    bw.close()
    br.close()
}