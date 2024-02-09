import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val page = br.readLine().split(" ").map { it.toInt() }
    val missingPage = ArrayList<Int>()

    for (i in 1 .. n) {
        if (i !in page) {
            missingPage.add(i)
        }
    }

    var lastPage = 0
    var result = 0

    for (i in missingPage) {
        result += if (lastPage != 0) {
            min(7, (i - lastPage) * 2)
        } else {
            7
        }

        lastPage = i
    }
    bw.write("$result")

    bw.close()
    br.close()
}