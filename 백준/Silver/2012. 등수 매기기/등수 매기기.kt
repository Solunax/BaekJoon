import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n + 1){0}

    for(i in 1 .. n)
        array[i] = br.readLine().toInt()

    array.sort()
    var result = 0L
    for(i in 1 .. n){
        if(i != array[i])
            result += kotlin.math.abs(array[i] - i)
    }

    bw.write("$result")

    bw.close()
    br.close()
}