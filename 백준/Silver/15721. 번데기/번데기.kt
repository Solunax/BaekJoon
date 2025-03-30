import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toInt()
    val t = br.readLine().toInt()
    val type = br.readLine().toInt()

    bw.write("${getResult(a, t, type)}")

    bw.close()
    br.close()
}

fun getResult(a: Int, t: Int, type: Int): Int {
    var c = 2
    var b = 0
    var d = 0

    while (true) {
        repeat(4) {
            when (it % 2) {
                0 -> b++
                1 -> d++
            }

            if ((type == 0 && b == t) || (type == 1 && d == t)) {
                return (b + d - 1) % a
            }
        }

        repeat(c) {
            b++

            if (type == 0 && b == t) {
                return (b + d - 1) % a
            }
        }

        repeat(c) {
            d++

            if (type == 1 && d == t) {
                return (b + d - 1) % a
            }
        }

        c++
    }
}