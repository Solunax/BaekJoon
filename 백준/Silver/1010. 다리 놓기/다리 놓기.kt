import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val case = br.readLine().toInt()
    val array = Array(31){Array(31){0} }

    array[0][0] = 1
    array[1][0] = 1
    array[1][1] = 1

    for(i in 1..30){
        for(j in 0 .. i){
            when (j) {
                0 -> array[i][0] = 1
                i -> array[i][j] = 1
                else -> array[i][j] = array[i-1][j] + array[i-1][j-1]
            }
        }
    }
    for(i in 0 until case){
        val input = br.readLine().split(" ").map { it.toInt() }
        bw.write("${array[input[1]][input[0]]}\n")
        bw.flush()
    }

    br.close()
    bw.close()
}