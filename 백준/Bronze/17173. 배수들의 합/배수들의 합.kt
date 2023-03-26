import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map{ it.toInt() }
    val num = br.readLine().split(" ").map { it.toInt() }

    var sum = 0
    for(i in 1 .. n){
        for(j in num){
            if(i % j == 0){
                sum += i
                break
            }
        }
    }

    bw.write("$sum")

    br.close()
    bw.close()
}