import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result = Array(4){0}

    repeat(br.readLine().toInt()) {
        val (g, c, _) = br.readLine().split(" ").map{ it.toInt() }

        if (g == 1) {
            result[3]++
        } else {
            when(c) {
                in 1 .. 2 -> result[0]++
                3 -> result[1]++
                4 -> result[2]++
            }
        }
    }

    result.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}