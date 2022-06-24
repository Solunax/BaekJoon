import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfStore = br.readLine().toInt()
    val typeOfMilk = br.readLine().split(" ").map { it.toInt() }

    var now = 0
    var result = 0
    typeOfMilk.forEach {
        if(it == now){
            result++
            now = when(it){
                0 -> 1
                1 -> 2
                2 -> 0
                else -> -1
            }
        }
    }

    bw.write("$result")
    bw.close()
    br.close()
}