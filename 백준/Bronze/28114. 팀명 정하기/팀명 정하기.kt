import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result1 = Array(3){0}
    val result2 = Array(3){ Pair(0, ' ') }

    repeat(3) {
        val input = br.readLine().split(" ")

        result1[it] = input[1].toInt() % 100
        result2[it] = Pair(input[0].toInt(), input[2][0])
    }

    result1.sorted().forEach {
        bw.write("$it")
    }
    bw.write("\n")

    result2.sortedByDescending { it.first }.forEach {
        bw.write("${it.second}")
    }

    bw.close()
    br.close()
}