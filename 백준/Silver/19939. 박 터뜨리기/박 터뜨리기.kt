import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, k) = br.readLine().split(" ").map { it.toInt() }
    var flag = true

    for(i in 0 until k){
        n -= i + 1

        if(n < 0){
            flag = false
            break
        }
    }

    if(flag){
        if(n % k > 0)
            bw.write("$k")
        else
            bw.write("${k - 1}")
    }else
        bw.write("-1")

    bw.close()
    br.close()
}