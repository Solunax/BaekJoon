import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        val num = input.toInt()
        var stand = 1
        var count = 0

        while(true){
            count++
            stand %= num

            if(stand == 0)
                break

            stand = stand * 10 + 1
        }

        bw.write("$count\n")
    }



    br.close()
    bw.close()
}