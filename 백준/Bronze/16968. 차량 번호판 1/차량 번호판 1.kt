import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val car = br.readLine()
    var result = 1

    for (i in car.indices) {
        if (i == 0) {
            result *= if (car[i] == 'c') {
                26
            } else {
                10
            }
        } else {
            result *= if (car[i] == car[i - 1]) {
                if (car[i] == 'c') {
                    25
                } else {
                    9
                }
            } else {
                if (car[i] == 'c') {
                    26
                } else {
                    10
                }
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}