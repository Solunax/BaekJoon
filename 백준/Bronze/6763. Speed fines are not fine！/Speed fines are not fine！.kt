import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val limit = br.readLine().toInt()
    val speed = br.readLine().toInt()

    if(speed - limit <= 0)
        bw.write("Congratulations, you are within the speed limit!")
    else{
        when(speed - limit){
            in 1 .. 20 -> bw.write("You are speeding and your fine is $100.")
            in 21 .. 30 -> bw.write("You are speeding and your fine is $270.")
            else -> bw.write("You are speeding and your fine is $500.")
        }
    }

    bw.close()
    br.close()
}