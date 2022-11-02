import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var input = br.readLine()

        if(input == "0")
            break

        if(input.length == 1)
            bw.write("$input\n")
        else{
            while(true){
                var sum = 0
                input.forEach {
                    sum += it-'0'
                }

                if(sum.toString().length == 1){
                    bw.write("$sum\n")
                    break
                }
                else
                    input = sum.toString()
            }
        }
    }

    bw.close()
    br.close()
}