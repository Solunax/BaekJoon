import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0
    while(true){
        val input = br.readLine().toInt()

        if(input == -1)
            break

        sum += input
    }

    bw.write("$sum")

    br.close()
    bw.close()
}