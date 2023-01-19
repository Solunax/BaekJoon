import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = Array(1000){0}

    var num = 1
    var count = 0
    for(i in 0 until 1000){
        arr[i] = num
        count++

        if(count == num){
            num++
            count = 0
        }
    }

    val (a, b) = br.readLine().split(" ").map { it.toInt() - 1 }
    var result = 0

    for(i in a .. b)
        result += arr[i]

    bw.write("$result")

    br.close()
    bw.close()
}