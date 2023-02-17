import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val start = br.readLine().toInt()
    val end = br.readLine().toInt()
    val result = ArrayList<Int>()

    for(i in 1 .. 100){
        if(i*i > end)
            break

        if(i*i in start..end)
            result.add(i*i)
    }

    if(result.size == 0)
        bw.write("-1")
    else{
        var sum = 0
        result.forEach {
            sum += it
        }
        bw.write("$sum\n")
        bw.write("${result[0]}")
    }

    br.close()
    bw.close()
}