import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val pw = br.readLine()
    val m = pw.length / n
    val arr = Array(m){ Array(n) {""} }

    var index = 0
    for(i in 0 until m){
        val temp = pw.substring(index until  index + n)

        if(i % 2 == 0)
            arr[i] = temp.split("").filter { it.isNotEmpty() }.toTypedArray()
        else
            arr[i] = temp.reversed().split("").filter { it.isNotEmpty() }.toTypedArray()

        index += n
    }

    for(i in 0 until n){
        for(j in 0 until m)
            bw.write(arr[j][i])
    }

    bw.close()
    br.close()
}