import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val total = br.readLine().toInt()
    var sum = 0
    repeat(br.readLine().toInt()){
        val (price, amount) = br.readLine().split(" ").map { it.toInt() }
        sum += price * amount
    }

    if(total == sum)
        bw.write("Yes")
    else
        bw.write("No")

    bw.close()
    br.close()
}