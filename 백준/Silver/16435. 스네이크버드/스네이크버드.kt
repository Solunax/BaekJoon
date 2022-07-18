import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections.max
import java.util.Collections.sort

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, l) = br.readLine().split(" ").map { it.toInt() }
    val fruits = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    fruits.sort()

    for(i in 0 until n){
        if(fruits[i] <= l)
            l += 1
        else
            break
    }

    bw.write("$l")

    bw.close()
    br.close()
}