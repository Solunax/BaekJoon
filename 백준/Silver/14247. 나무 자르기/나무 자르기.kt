import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val tree = br.readLine().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
    val growth = br.readLine().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()
    growth.sort()
    
    var result = 0L
    for(i in 0 until n)
        result += tree [i]

    for(i in 0 until n)
        result += growth [i] * i

    bw.write("$result")
    bw.close()
    br.close()
}
