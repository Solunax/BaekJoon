import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var square : Array<Array<Int>>

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    square = Array(n){ Array(m){0} }

    repeat(n){
        square[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.map { v -> v.toInt() }.toTypedArray()
    }

    var maxSize = 1
    for(i in 0 until n){
        for(j in 0 until m){
            val num = square[i][j]
            var len = 1
            var x2 = j + 1
            var y2 = i + 1
            while(x2 < m && y2 < n){
                len++

                if(square[i][x2] == num && square[y2][j] == num && square[y2][x2] == num)
                    maxSize = max(maxSize, len * len)

                x2++
                y2++
            }
        }
    }
    bw.write("$maxSize")

    br.close()
    bw.close()
}