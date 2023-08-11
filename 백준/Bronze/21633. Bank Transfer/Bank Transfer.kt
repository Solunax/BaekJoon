import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toDouble()
    val fee = n * 0.01 + 25

    if(fee < 100)
        bw.write("100.00")
    else if(fee > 2000)
        bw.write("2000.00")
    else
        bw.write("%.2f".format(fee))

    bw.close()
    br.close()
}