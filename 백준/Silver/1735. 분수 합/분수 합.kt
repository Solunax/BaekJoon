import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v1 = br.readLine().split(" ").map { it.toInt() }
    val v2 = br.readLine().split(" ").map { it.toInt() }

    var j = v1[0] * v2[1] + v1[1] * v2[0]
    var m = v1[1] * v2[1]
    val v = gcd(j, m)

    j /= v
    m /= v

    bw.write("$j $m")

    bw.close()
    br.close()
}

fun gcd(a : Int, b: Int) : Int{
    val r = a % b
    if(r == 0)
        return b

    return gcd(b, r)
}