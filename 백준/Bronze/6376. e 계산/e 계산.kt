import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("n e\n- -----------\n")
    var sum = 0.0

    for (i in 0 until 10) {
        sum += 1.0 / factorial(i)

        when (i) {
            in 0..1 -> bw.write("$i ${sum.toInt()}\n")
            2 -> bw.write("%d %.1f\n".format(i, sum))
            else -> bw.write("%d %.9f\n".format(i, sum))
        }
    }

    bw.close()
    br.close()
}

fun factorial(n: Int): Int {
    var facto = 1

    if (n <= 1) {
        return 1
    }

    for (i in 1..n) {
        facto *= i
    }

    return facto
}