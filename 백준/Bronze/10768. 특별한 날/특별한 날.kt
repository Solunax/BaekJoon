import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val month = br.readLine().toInt()
    val date = br.readLine().toInt()

    when(month){
        1 -> bw.write("Before")
        2 -> {
            when(date){
                in 1..17 -> bw.write("Before")
                18 -> bw.write("Special")
                else -> bw.write("After")
            }
        }
        else -> bw.write("After")
    }

    br.close()
    bw.close()
}