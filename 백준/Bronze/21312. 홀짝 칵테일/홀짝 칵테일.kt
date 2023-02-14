import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var result = 0

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
    
    scoreCheck(a)
    scoreCheck(b)
    scoreCheck(c)
    scoreCheck(a * b)
    scoreCheck(a * c)
    scoreCheck(b * c)
    scoreCheck(a * b * c)

    bw.write("$result")

    br.close()
    bw.close()
}

fun scoreCheck(score : Int){
    if(result % 2 == 1 && score % 2 == 0)
        return
    else if(result % 2 == 0 && score % 2 == 1){
        result = score
        return
    }

    if(result < score)
        result = score
}