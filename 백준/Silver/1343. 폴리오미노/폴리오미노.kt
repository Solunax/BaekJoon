import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var board = br.readLine()
    
    board = board.replace("XXXX", "AAAA")
    board = board.replace("XX", "BB")

    if(board.contains("X"))
        bw.write("-1")
    else
        bw.write(board)

    bw.close()
    br.close()
}
