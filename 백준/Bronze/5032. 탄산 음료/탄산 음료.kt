import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (e, f, c) = br.readLine().split(" ").map { it.toInt() }
    var total = e+f
    var result = 0

    while(true){
        if(total-c < 0)
            break

        val newBottle = total/c
        result += newBottle
        total = total % c + newBottle
    }

    bw.write("$result")

    br.close()
    bw.close()
}