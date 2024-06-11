import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = listOf("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#")

    while (true) {
        val input = br.readLine().split(" ")

        if (input[0] == "***") {
            break
        }

        val change = br.readLine().toInt()

        input.forEach {
            var idx = when (it) {
                "A" -> 0
                "A#", "Bb" -> 1
                "B", "Cb" -> 2
                "B#", "C" -> 3
                "C#", "Db" -> 4
                "D" -> 5
                "D#", "Eb" -> 6
                "E", "Fb" -> 7
                "E#", "F" -> 8
                "F#", "Gb" -> 9
                "G" -> 10
                "G#", "Ab" -> 11
                else -> -1
            }

            if (idx + change < 0) {
                idx += 12
            }

            bw.write("${arr[(idx + change) % 12]} ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}