import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val (balance, type, amount) = br.readLine().split(" ")

        if(balance == "0" && type == "W" && amount == "0")
            break

        when(type){
            "W" -> {
                val now = balance.toInt() - amount.toInt()
                if(now < -200)
                    bw.write("Not allowed\n")
                else
                    bw.write("$now\n")
            }
            "D" -> bw.write("${balance.toInt() + amount.toInt()}\n")
        }
    }

    bw.close()
    br.close()
}