import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val card = Array(20){0}
    repeat(20){
        card[it] = it+1
    }

    repeat(10){
        var (start, end) = br.readLine().split(" ").map { it.toInt() - 1 }

        while (start < end){
            card[start] = card[end].also { card[end] = card[start] }

            start++
            end--
        }
    }

    card.forEach {
        bw.write("$it ")
    }

    br.close()
    bw.close()
}