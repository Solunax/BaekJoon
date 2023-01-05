import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, l) = br.readLine().split(" ").map { it.toInt() }
    val check = Array(n){0}
    check[0] = 1
    var result = 0
    var now = 0

    while(true){
        if(check[now] == m)
            break

        if(check[now] % 2 == 0){
            now += l

            if(now >= n)
                now -= n

            check[now]++
        }else{
            now -= l

            if(now < 0)
                now += n

            check[now]++
        }
        result++
    }
    bw.write("$result")

    br.close()
    bw.close()
}