import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections.max
import java.util.Collections.sort

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    for(i in 0 until case){
        val days = br.readLine().toInt()
        val stocks = br.readLine().split(" ").map{ it.toInt() }
        var max = 0

        var result = 0L
        for(j in days - 1 downTo  0){
            if(stocks[j] > max)
                max = stocks[j]
            else
                result += max - stocks[j]
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}