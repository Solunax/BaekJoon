import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = Array(26){0}

    br.readLine()
    br.readLine().forEach {
        arr[it - 'a']++
    }

    var max = 0
    for (i in 0 until 26) {
        if(arr[i] > max)
            max = arr[i]
    }

    bw.write("${(arr.indexOf(max) + 'a'.code).toChar()} $max")

    bw.close()
    br.close()
}