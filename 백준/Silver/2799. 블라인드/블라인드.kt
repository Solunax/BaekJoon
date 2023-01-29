import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (m, n) = br.readLine().split(" ").map { it.toInt() }
    val height = 5 * m + 1
    val width = 5 * n + 1
    val building = Array(height){ Array(width){" "} }

    repeat(height){
        building[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    var state0 = 0
    var state1 = 0
    var state2 = 0
    var state3 = 0
    var state4 = 0

    for(i in 0 until height-1 step 5){
        for(j in 1 until width step 5){
            var count = 0

            for(k in 1 .. 4){
                if(building[i+k][j] == ".")
                    break
                else
                    count++
            }

            when(count){
                0 -> state0++
                1 -> state1++
                2 -> state2++
                3 -> state3++
                4 -> state4++
            }
        }
    }

    bw.write("$state0 $state1 $state2 $state3 $state4")

    br.close()
    bw.close()
}

