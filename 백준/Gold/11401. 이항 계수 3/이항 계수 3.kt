import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(n, k) = br.readLine().split(" ").map { it.toLong() }

    val number = facto(n)
    val m = facto(k) * facto(n - k) % 1000000007

    bw.write("${number * get(m, 1000000007 - 2) % 1000000007}")

    bw.close()
    br.close()
}

fun facto(number:Long):Long{
    var number = number
    var value = 1L
    while(number > 1){
        value = (value * number) % 1000000007
        number--
    }
    return value
}

fun get(n:Long, k:Long): Long {
    if(k == 1L)
        return (n % 1000000007).toLong()

    val temp = get(n, k / 2)

    if(k %2 == 1L)
        return (temp * temp % 1000000007) * n % 1000000007

    return temp * temp % 1000000007
}