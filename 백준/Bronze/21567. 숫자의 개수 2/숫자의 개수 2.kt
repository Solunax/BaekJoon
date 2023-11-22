import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = BigInteger.ONE
    val count = Array(10){0}

    repeat(3) {
        result = result.multiply(BigInteger(br.readLine()))
    }

    result.toString().forEach {
        count[it - '0']++
    }

    count.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}