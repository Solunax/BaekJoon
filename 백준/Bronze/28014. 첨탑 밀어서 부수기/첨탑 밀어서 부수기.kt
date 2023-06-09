import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val tower = br.readLine().split(" ").map { it.toInt() }

    var push = 1
    for(i in 1 until n){
        if(tower[i - 1] <= tower[i])
            push++
    }

    bw.write("$push")

    bw.close()
    br.close()
}