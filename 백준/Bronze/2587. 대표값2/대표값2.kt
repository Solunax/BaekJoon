import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = Array(5){0}

    repeat(5){
        arr[it] = br.readLine().toInt()
    }

    arr.sort()

    var sum = 0
    arr.forEach {
        sum += it
    }

    bw.write("${(sum/5)}\n")
    bw.write("${arr[2]}")
    bw.close()
    br.close()
}