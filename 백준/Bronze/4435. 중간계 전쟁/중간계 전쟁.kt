import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val good = listOf(1, 2, 3, 3, 4, 10)
    val evil = listOf(1, 2, 2, 2, 3, 5, 10)
    repeat(br.readLine().toInt()){
        var index = 0
        var gSum = 0
        br.readLine().split(" ").map { v -> v.toInt() }.forEach { v ->
            gSum += good[index++] * v
        }

        index = 0
        var eSum = 0
        br.readLine().split(" ").map { v -> v.toInt() }.forEach { v ->
            eSum += evil[index++] * v
        }

        bw.write("Battle ${it + 1}: ")
        if(gSum > eSum)
            bw.write("Good triumphs over Evil\n")
        else if(gSum < eSum)
            bw.write("Evil eradicates all trace of Good\n")
        else
            bw.write("No victor on this battle field\n")
    }

    bw.close()
    br.close()
}