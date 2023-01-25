import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var(n, m, k) = br.readLine().split(" ").map { it.toInt() }

    var result = 0
    while(true){
        if(n + m - k < 3 || n < 2 || m < 1)
            break

        n -= 2
        m -= 1
        result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}