import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var check = true

    for(i in 1 until input.size){
        if(input[i-1] > input[i]){
            check = false
            break
        }
    }

    if(check)
        bw.write("Good")
    else
        bw.write("Bad")

    bw.close()
    br.close()
}