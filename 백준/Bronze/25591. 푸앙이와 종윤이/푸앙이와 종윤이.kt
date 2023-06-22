import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ")
    val a = 100 - v1.toInt()
    val b = 100 - v2.toInt()
    val c = 100 - (a + b)
    val d = a * b
    val q = d / 100
    val r = d % 100

    bw.write("$a $b $c $d $q $r\n")
    bw.write("%1d %1d".format(c + q, r))

    bw.close()
    br.close()
}