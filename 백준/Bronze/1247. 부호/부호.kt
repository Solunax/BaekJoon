import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(3){
        var sum = BigInteger("0")

        repeat(br.readLine().toInt()){
            sum = sum.add(BigInteger(br.readLine()))
        }

        if(sum.compareTo(BigInteger.ZERO) == -1)
            bw.write("-\n")
        else if(sum.compareTo(BigInteger.ZERO) == 1)
            bw.write("+\n")
        else
            bw.write("0\n")
    }

    bw.close()
    br.close()
}