import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var change = br.readLine().toInt()
    var result = 0

    while(change > 0){
        if(change % 5 == 0){
            result += change / 5
            break
        }

        change -= 2
        result++
    }

    if(change < 0)
        bw.write("-1")
    else
        bw.write("$result")

    bw.close()
    br.close()
}