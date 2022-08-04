import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = Array(26){0}
    val b = Array(26){0}

    br.readLine().forEach {
        a[it - 'a']++
    }

    br.readLine().forEach {
        b[it - 'a']++
    }

    var result = 0
    for(i in 0 until 26){
        if(a[i] != b[i]){
            result += abs(a[i] - b[i])
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}
