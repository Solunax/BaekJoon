import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val people = br.readLine().split(" ").map { it.toInt() }
    val (x, _, _) = br.readLine().split(" ").map { it.toInt() }

    if(people.contains(x))
        bw.write("${people.indexOf(x)+1}")
    else
        bw.write("0")

    br.close()
    bw.close()
}