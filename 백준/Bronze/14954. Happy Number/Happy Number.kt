import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var n = br.readLine()

    while (true){
        var sum = 0
        n.forEach {
            val temp = it - '0'
            sum += temp * temp
        }

        if(sum == 1){
            bw.write("HAPPY")
            break
        }else if(sum == 4){
            bw.write("UNHAPPY")
            break
        }

        n = sum.toString()
    }

    bw.close()
    br.close()
}