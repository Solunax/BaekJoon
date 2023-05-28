import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split(" ")
    var flag = true

    val check = input[0][0]
    for(i in 1 until n){
        if(input[i][0] != check){
            flag = false
            break
        }
    }

    if(flag)
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}