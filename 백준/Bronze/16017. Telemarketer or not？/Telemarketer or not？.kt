import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n1 = br.readLine().toInt()
    val n2 = br.readLine().toInt()
    val n3 = br.readLine().toInt()
    val n4 = br.readLine().toInt()

    if(n1 in 8 .. 9 && n2 == n3 && n4 in 8 .. 9)
        bw.write("ignore")
    else
        bw.write("answer")

    bw.close()
    br.close()
}