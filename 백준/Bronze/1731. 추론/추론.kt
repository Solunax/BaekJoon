import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = Array(n){0}

    repeat(n){
        num[it] = br.readLine().toInt()
    }

    if(num[1] - num[0] == num[2] - num[1])
        bw.write("${num.last() + num[1] - num[0]}")
    else
        bw.write("${num.last() * (num[1] / num[0])}")

    bw.close()
    br.close()
}