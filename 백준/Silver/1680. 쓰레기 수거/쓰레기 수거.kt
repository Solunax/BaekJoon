import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (maxWeight, n) = br.readLine().split(" ").map { it.toInt() }
        var nowWeight = maxWeight
        var result = 0

        repeat(n) {
            val (distance, garbage) = br.readLine().split(" ").map { it.toInt() }

            if (nowWeight - garbage < 0) {
                result += distance * 2
                nowWeight = maxWeight - garbage
            } else if (nowWeight - garbage == 0) {
                result += distance * 2
                nowWeight = maxWeight
            } else {
                nowWeight -= garbage
            }

            if (it == n - 1 && nowWeight != maxWeight) {
                result += distance * 2
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}