import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ")
        var price = input[0].toDouble()
        val dot = input[1]
        val coupon = input[2]
        val payment = input[3]

        price *= when (dot) {
            "R" -> 0.55
            "G" -> 0.7
            "B" -> 0.8
            "Y" -> 0.85
            "O" -> 0.9
            "W" -> 0.95
            else -> 1.0
        }

        price *= when (coupon) {
            "C" -> 0.95
            else -> 1.0
        }

        if (payment == "C") {
            price = round(price * 10) / 10
            price *= 100
            price = if (price % 10 > 5) {
                price + 10 - price % 10
            } else {
                price - price % 10
            }

            price /= 100
        }

        bw.write("$%.2f\n".format(price))
    }

    bw.close()
    br.close()
}