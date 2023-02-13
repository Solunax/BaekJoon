import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ")
    val n = input[0].toInt()
    val x = input[1]

    var num = 0

    for(i in 0 until n){
        while(true){
            num++

            if(!num.toString().contains(x))
                break
        }
    }

    bw.write("$num")

    br.close()
    bw.close()
}