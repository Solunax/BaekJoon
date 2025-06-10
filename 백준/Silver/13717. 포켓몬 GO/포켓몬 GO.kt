import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var name = ""
    var maxPokemon = 0
    var resultCount = 0

    repeat(n) {
        val t = br.readLine()
        var (need, have) = br.readLine().split(" ").map { it.toInt() }
        var count = 0

        while (need <= have) {
            have -= need
            have += 2
            count += 1
        }
        resultCount += count

        if (maxPokemon < count) {
            name = t
            maxPokemon = count
        }
    }
    bw.write("${resultCount}\n$name")

    bw.close()
    br.close()
}