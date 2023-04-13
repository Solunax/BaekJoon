import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var maxX1 = 10001
    var maxY1 = 10001
    var maxX2 = -10001
    var maxY2 = -10001

    repeat(br.readLine().toInt()){
        val (x, y) = br.readLine().split(" ").map{ it.toInt() }

        if(x < maxX1)
            maxX1 = x

        if(x > maxX2)
            maxX2 = x

        if(y < maxY1)
            maxY1 = y

        if(y > maxY2)
            maxY2 = y
    }
    bw.write("${(maxX2 - maxX1) * (maxY2 - maxY1)}")

    bw.close()
    br.close()
}