import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sb = StringBuilder()

    repeat(n){
        sb.append(1)
    }

    repeat(n - 1){
        sb.append(0)
    }

    bw.write(sb.toString())

    bw.close()
    br.close()
}