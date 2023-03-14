import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toBigInteger(2)
    bw.write(convert(input.multiply(BigInteger("17"))))

    br.close()
    bw.close()
}

fun convert(v1 : BigInteger) : String{
    var n = v1
    val sb = StringBuilder()
    val zero = BigInteger("0")
    val two = BigInteger("2")

    while(n > zero){
        val temp = n.remainder(two)
        if(temp == zero)
            sb.append("0")
        else
            sb.append("1")

        n = n.divide(two)
    }

    return sb.reverse().toString()
}