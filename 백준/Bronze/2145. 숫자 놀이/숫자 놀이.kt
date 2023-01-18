import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var input = br.readLine()

        if(input == "0")
            break

        while(input.length != 1){
            var sum = 0
            input.forEach {
                sum += it - '0'
            }

            input = sum.toString()
        }

        bw.write("$input\n")
    }

    br.close()
    bw.close()
}