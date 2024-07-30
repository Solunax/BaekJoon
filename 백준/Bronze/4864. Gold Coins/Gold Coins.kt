import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        var totalCoin = 0
        var pay = 1
        var day = 1
        var addDay = 1
        var increaseDay = 2
        while (day <= n) {
            totalCoin += pay

            if (day == addDay) {
                addDay += increaseDay++
                pay++
            }

            day++
        }

        bw.write("$n $totalCoin\n")
    }

    bw.close()
    br.close()
}