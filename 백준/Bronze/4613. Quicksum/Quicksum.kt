import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input == "#")
            break

        var sum = 0L
        var count = 1
        input.forEach {
            if(it != ' ')
                sum += (it - 'A' + 1) * count

            count++
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}