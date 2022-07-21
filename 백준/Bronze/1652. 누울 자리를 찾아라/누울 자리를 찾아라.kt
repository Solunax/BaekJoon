import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){ Array(n){ "" } }

    for(i in 0 until n)
        array[i] = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()

    var vertical = 0
    var horizontal = 0
    for(i in 0 until n){
        var checkV = 0
        var checkH = 0
        for(j in 0 until n){
            if(array[i][j] == ".")
                checkH++
            if(array[i][j] == "X" || j == n - 1){
                if(checkH >= 2)
                    horizontal++
                checkH = 0
            }

            if(array[j][i] == ".")
                checkV++
            if(array[j][i] == "X" || j == n - 1){
                if(checkV >= 2)
                    vertical++
                checkV = 0
            }
        }
    }

    bw.write("$horizontal $vertical")
    bw.close()
    br.close()
}