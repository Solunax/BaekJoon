import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val xArr = ArrayList<Int>()
    val yArr = ArrayList<Int>()

    repeat(br.readLine().toInt()){
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        xArr.add(x)
        yArr.add(y)
    }

    bw.write("${((xArr.max() - xArr.min()) + (yArr.max() - yArr.min())) * 2}")

    bw.close()
    br.close()
}