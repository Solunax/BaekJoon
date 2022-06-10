import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (v1, v2) = br.readLine().split(" ").map { it.toLong() }
    var result = 1

    while(v1 != v2){
        if(v2 < v1){
            result = -1
            break
        }
        if(v2 % 10 == 1L)
            v2 /= 10
        else if(v2 % 2 == 0L)
            v2 /= 2
        else{
            result = -1
            break
        }
        result++
    }

    bw.write("$result")
    bw.close()
    br.close()
}
