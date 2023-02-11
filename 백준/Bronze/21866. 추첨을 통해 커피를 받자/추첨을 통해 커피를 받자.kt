import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val standard = listOf(100, 100, 200, 200, 300, 300, 400, 400, 500)
    val score = br.readLine().split(" ").map{ it.toInt() }

    var hackerCheck = false
    var total = 0
    for(i in 0 until 9){
        if(score[i] > standard[i]){
            hackerCheck = true
            break
        }

        total += score[i]
    }

    if(hackerCheck)
        bw.write("hacker")
    else{
        if(total >= 100)
            bw.write("draw")
        else
            bw.write("none")
    }

    br.close()
    bw.close()
}