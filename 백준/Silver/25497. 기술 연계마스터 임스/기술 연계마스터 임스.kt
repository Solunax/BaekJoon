import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    bw.write("${getResult(br.readLine())}")

    bw.close()
    br.close()
}

fun getResult(str: String): Int {
    var count = 0
    var l = 0
    var s = 0

    str.forEach { c ->
        when (c) {
            in '1'..'9' -> count++
            'L' -> l++
            'R' -> {
                if (l >= 1) {
                    l--
                    count++
                } else {
                    return count
                }
            }
            'S' -> s++
            'K' -> {
                if (s >= 1) {
                    s--
                    count++
                } else {
                    return count
                }
            }
        }
    }

    return count
}