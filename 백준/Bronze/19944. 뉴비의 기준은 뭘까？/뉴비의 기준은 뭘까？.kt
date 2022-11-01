import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    if(m <= 2)
        bw.write("NEWBIE!")
    else if(m <= n)
        bw.write("OLDBIE!")
    else
        bw.write("TLE!")

    bw.close()
    br.close()
}