import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val k = br.readLine().toInt()
    val a = Array(k + 1) { 0 }
    val b = Array(k + 1) { 0 }

    a[1] = 0
    b[1] = 1
    if (k > 1) {
        a[2] = 1
        b[2] = 1
    }

    for (i in 3..k){
        a[i] = a[i - 2] + a[i - 1]
        b[i] = b[i - 2] + b[i - 1]
    }

    bw.write("${a.last()} ${b.last()}")

    bw.close()
    br.close()
}