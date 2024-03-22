import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var r = 0
var c = 0
var count = 0

fun main() {
    val (n, ir, ic) = br.readLine().split(" ").map { it.toInt() }
    val size = 2.0.pow(n).toInt()
    r = ir
    c = ic

    getResult(r, c, size)
    bw.write("$count")

    bw.close()
    br.close()
}

fun getResult(x: Int, y: Int, size: Int) {
    if (size == 1) {
        return
    }

    if (x < size / 2 && y < size / 2) {
        getResult(x, y, size / 2)
    } else if (x < size / 2 && size / 2 <= y) {
        count += (size * size / 4)
        getResult(x, y - size / 2, size / 2)
    } else if (x >= size / 2 && size / 2 > y) {
        count += (size * size / 4) * 2
        getResult(x - size / 2, y, size / 2)
    } else {
        count += (size * size / 4) * 3
        getResult(x - size / 2, y - size / 2, size / 2)
    }
}