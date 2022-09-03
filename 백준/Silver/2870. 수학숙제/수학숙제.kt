import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = ArrayList<BigInteger>()
    repeat(n){
        br.readLine().split("\\D".toRegex()).filter { it.isNotEmpty() }.forEach{
            num.add(it.toBigInteger())
        }
    }
    num.sort()
    num.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}