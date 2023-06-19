import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sequence = Array(n + 1){Pair(0, 0)}
    sequence[0] = Pair(-1, 0)
    var beforeIndex = 0

    for(i in 1 .. n){
        val input = br.readLine().split(" ")

        when(input[0]){
            "a" -> {
                sequence[i] = Pair(input[1].toInt(), beforeIndex)
                beforeIndex = i
            }
            "s" -> {
                sequence[i] = Pair(sequence[beforeIndex].first, beforeIndex)
                beforeIndex = sequence[beforeIndex].second
            }
            "t" -> {
                sequence[i] = Pair(sequence[beforeIndex].first, beforeIndex)
                beforeIndex = sequence[input[1].toInt()].second
            }
        }

        bw.write("${sequence[beforeIndex].first}\n")
    }

    bw.close()
    br.close()
}
