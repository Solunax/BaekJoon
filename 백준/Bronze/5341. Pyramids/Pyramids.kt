import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().toInt()

        if(input == 0)
            break

        var sum = 0
        for(i in input downTo 1)
            sum += i

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}