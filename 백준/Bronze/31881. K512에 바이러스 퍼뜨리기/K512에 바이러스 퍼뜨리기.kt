import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val virus = BooleanArray(n + 1)
    var count = n

    repeat(q) {
        val input = br.readLine().split(" ")

        when (input[0]) {
            "1" -> {
                if (!virus[input[1].toInt()]) {
                    count--
                }
                virus[input[1].toInt()] = true
            }
            "2" -> {
                if (virus[input[1].toInt()]) {
                    count++
                }
                virus[input[1].toInt()] = false
            }
            "3" -> bw.write("$count\n")
        }
    }

    bw.close()
    br.close()
}