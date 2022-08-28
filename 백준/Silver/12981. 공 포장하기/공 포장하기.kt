import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val balls = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()
    balls.sort()
    var result = 0

    result += balls[0]
    balls[1] -= balls[0]
    balls[2] -= balls[0]

    result += balls[1] / 3 + balls[2] / 3
    result += if(balls[1] % 3 != 0) 1 else 0
    result += if(balls[2] % 3 != 0) 1 else 0

    if(balls[1] % 3 == 1 && balls[2] % 3 == 1)
        result--

    bw.write("$result")
    bw.close()
    br.close()
}
