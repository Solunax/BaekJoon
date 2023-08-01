import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val start = getSec(br.readLine().split(" : ").map { it.toInt() }.reversed())
    val end = getSec(br.readLine().split(" : ").map { it.toInt() }.reversed())

    if (end < start)
        bw.write("${getSec(listOf(0, 0, 24)) - start + end}")
    else
        bw.write("${end - start}")

    bw.close()
    br.close()
}

fun getSec(time : List<Int>) : Int {
    var sec = 0
    var t = 1

    time.forEach {
        sec += it * t
        t *= 60
    }

    return sec
}