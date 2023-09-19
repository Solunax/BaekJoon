import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(' ').map { it.toInt() }
    val input = StringTokenizer(br.readLine())
    val quest = MutableList(n){0L}
    var total = 0L

    for(i in 0 until n)
        quest[i] = input.nextToken().toLong()

    Collections.sort(quest)

    for(i in 0 until k)
        total += quest[i] * i

    for(i in k until n)
        total += quest[i] * k

    bw.write("$total")

    bw.close()
    br.close()
}