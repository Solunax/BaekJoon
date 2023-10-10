import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val lotto = br.readLine()
    var count = 1

    for(i in 1 until n){
        if(lotto[i] - lotto[i - 1] == 1 || lotto[i] - lotto[i - 1] == -1){
            count++

            if(count == 5)
                break
        }else
            count = 1
    }

    if(count == 5)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}