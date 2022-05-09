import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val input = br.readLine().split(" ").map{ it.toInt() }
var array = Array(input[0] + 1){Array(input[0] + 1){0} }

fun main() {
    for(i in 1 .. input[0]){
        val num = br.readLine().split(" ").map{ it.toInt() }
        for(j in 1 .. input[0])
            array[i][j] = array[i - 1][j] + array[i][j - 1] - array[i - 1][j - 1] + num[j - 1]
    }


    for(i in 0 until input[1]){
        val (y1, x1, y2, x2) = br.readLine().split(" ").map { it.toInt() }

        val result = array[y2][x2] - array[y1 -1][x2] - array[y2][x1 - 1] + array[y1 -1][x1 - 1]
        bw.write("$result\n")
    }

    bw.flush()

    br.close()
    bw.close()
}