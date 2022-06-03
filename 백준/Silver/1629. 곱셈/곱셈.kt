import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(a, b, c) = br.readLine().split(" ").map { it.toInt() }

    val result = get(a, b, c)
    bw.write("$result")

    bw.close()
    br.close()
}

fun get(a:Int, b:Int, c:Int): Long {
    if(b == 1)
        return (a % c).toLong()

    val temp = get(a, b / 2, c)
    if(b % 2 == 1)
        return (temp * temp % c) * a % c

    return temp * temp % c
}