import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val (S, G, P, D) = br.readLine().split(" ").map { it.toInt() }
    val array = br.readLine().split("").filter { it.isNotEmpty() }

    var result = 0
    var previous = 0
    array.forEach {
        when(it){
            "B" -> {
                result += S - 1 - previous
                previous = S - 1 - previous
            }
            "S" -> {
                result += G - 1 - previous
                previous = G - 1 - previous
            }
            "G" -> {
                result += P - 1 - previous
                previous = P - 1 - previous
            }
            "P" -> {
                result += D - 1 - previous
                previous = D - 1 - previous
            }
            "D" -> {
                result += D
                previous = D
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}