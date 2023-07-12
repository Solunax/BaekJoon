import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (name, score) = br.readLine().split(" ")

        val rank = when(score.toInt()){
            in 97..100 -> "A+"
            in 90..96 -> "A"
            in 87..89 -> "B+"
            in 80..86 -> "B"
            in 77..79 -> "C+"
            in 70..76 -> "C"
            in 67..69 -> "D+"
            in 60..66 -> "D"
            else -> "F"
        }

        bw.write("$name $rank\n")
    }

    bw.close()
    br.close()
}