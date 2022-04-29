import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val numberOfDivisor = br.readLine().toInt()
    val divisorNumbers = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    divisorNumbers.sort()
    bw.write("${divisorNumbers[0] * divisorNumbers[numberOfDivisor-1]}")

    bw.flush()
    bw.close()
    br.close()
}
