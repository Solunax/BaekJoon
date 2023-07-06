import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    if(a >= 3 && b <= 4)
        bw.write("TroyMartian\n")

    if(a <= 6 && b >= 2)
        bw.write("VladSaturnian\n")

    if(a <= 2 && b <= 3)
        bw.write("GraemeMercurian\n")

    bw.close()
    br.close()
}