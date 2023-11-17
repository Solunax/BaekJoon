import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (height, weight) = br.readLine().split(" ").map { it.toDouble() }
        val bmi = weight / (height * 0.01).pow(2)

        if (height < 140.1) {
            bw.write("6\n")
        } else if (height < 146.0) {
            bw.write("5\n")
        } else if (height < 159.0) {
            bw.write("4\n")
        } else if (height < 161.0) {
            if (bmi < 16.0 || bmi >= 35.0)
                bw.write("4\n")
            else {
                bw.write("3\n")
            }
        } else if (height < 204.0) {
            if (bmi >= 20.0 && bmi < 25.0) {
                bw.write("1\n")
            } else if (
                (bmi >= 18.5 && bmi < 20.0) ||
                (bmi >= 25.0 && bmi < 30.0)){
                bw.write("2\n")
            } else if (
                (bmi >= 16.0 && bmi < 18.5) ||
                (bmi >= 30.0 && bmi < 35.0)
            ) {
                bw.write("3\n")
            } else {
                bw.write("4\n")
            }
        } else {
            bw.write("4\n")
        }
    }

    bw.close()
    br.close()
}