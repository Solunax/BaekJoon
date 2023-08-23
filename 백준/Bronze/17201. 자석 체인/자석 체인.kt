import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val input = br.readLine()

    var flag = true
    for(i in 1 until input.length){
        if(input[i] == input[i - 1]){
            bw.write("No")
            flag = false
            break
        }
    }

    if(flag)
        bw.write("Yes")

    bw.close()
    br.close()
}