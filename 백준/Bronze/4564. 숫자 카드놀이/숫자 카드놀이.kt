import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var num = br.readLine()

        if(num == "0")
            break

        bw.write("$num ")

        while (num.length != 1){
            var sum = 1
            num.forEach {
                sum *= it - '0'
            }

            bw.write("$sum ")
            num = sum.toString()
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}