import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }

    if(n == 0)
        bw.write("0")
    else{
        val books = br.readLine().split(" ").map { it.toInt() }

        var weight = 0
        var result = 1

        for(i in 0 until n){
            weight += books[i]

            if(weight > m){
                result++
                weight = books[i]
            }
        }

        bw.write("$result")
    }

    bw.close()
    br.close()
}