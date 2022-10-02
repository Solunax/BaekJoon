import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, h) = br.readLine().split(" ").map { it.toInt() }
    var (x, y) = br.readLine().split(" ").map { it.toInt() }
    val t = br.readLine().toInt()

    var xReverse = false
    var yReverse = false

    val xT = t % (2*w)
    repeat(xT){
        if(x == 0)
            xReverse = false
        else if(x == w)
            xReverse = true

        when(xReverse){
            true -> x--
            false -> x++
        }
    }

    val yT = t % (2*h)
    repeat(yT){
        if(y == 0)
            yReverse = false
        else if(y == h)
            yReverse = true

        when(yReverse){
            true -> y--
            false -> y++
        }
    }

    bw.write("$x $y")

    bw.close()
    br.close()
}