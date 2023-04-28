import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var pointX = 0
        var pointY = 0
        var x1 = 0
        var y1 = 0
        var x2 = 0
        var y2 = 0
        var direction = 0

        br.readLine().forEach {
            // 0 - N, 1 - W, 2 - S, 3 - E
            when(it){
                'L' -> {
                    direction += 1
                    if(direction > 3)
                        direction = 0
                }
                'R' -> {
                    direction -= 1
                    if(direction < 0)
                        direction = 3
                }
                'F' -> {
                    when(direction){
                        0 -> pointY += 1
                        1 -> pointX -= 1
                        2 -> pointY -= 1
                        3 -> pointX += 1
                    }
                }
                'B' -> {
                    when(direction){
                        0 -> pointY -= 1
                        1 -> pointX += 1
                        2 -> pointY += 1
                        3 -> pointX -= 1
                    }
                }
            }

            x1 = min(pointX, x1)
            y1 = max(pointY, y1)
            x2 = max(pointX, x2)
            y2 = min(pointY, y2)
        }

        bw.write("${(x2 - x1) * (y1 - y2)}\n")
    }

    bw.close()
    br.close()
}