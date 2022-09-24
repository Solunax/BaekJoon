import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val result = Array(100001){0}

    repeat(n){
        result[(br.readLine().toDouble()*1000).toInt()]++
    }

    var count = 0
    for(i in result.indices){
        while(result[i] > 0 && count < 7){
            bw.write("%.3f\n".format(i/1000.0))
            result[i]--
            count++
        }
    }

    bw.close()
    br.close()
}


