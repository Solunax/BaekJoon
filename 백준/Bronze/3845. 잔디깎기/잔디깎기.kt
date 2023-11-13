import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (inputX, inputY, w) = br.readLine().split(" ").map { it.toDouble() }

        if(inputX == 0.0 && inputY == 0.0 && w == 0.0)
            break

        val nx = inputX.toInt()
        val ny = inputY.toInt()
        val xPoint = br.readLine().split(" ").map { it.toDouble() }.sortedDescending()
        val yPoint = br.readLine().split(" ").map { it.toDouble() }.sortedDescending()

        var check = true
        var x = 75.0
        for (i in 0 until nx) {
            if ((x - xPoint[i]) > w / 2)
                break

            x = xPoint[i] - w / 2
        }

        if (x > 0)
            check = false

        var y = 100.0
        for (i in 0 until ny) {
            if ((y - yPoint[i]) > w / 2)
                break

            y = yPoint[i] - w / 2
        }

        if (y > 0)
            check = false

        if (check) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.close()
    br.close()
}