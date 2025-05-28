import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val weight = br.readLine().toDouble()
    val height = br.readLine().toDouble()
    val bmi = weight / (height * height)

    val result = if(bmi > 25) {
        "Overweight"
    } else if (bmi in 18.5 .. 25.0) {
        "Normal weight"
    } else {
        "Underweight"
    }
    bw.write(result)

    bw.close()
    br.close()
}