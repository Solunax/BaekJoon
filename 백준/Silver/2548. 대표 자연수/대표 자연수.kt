import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map{ it.toInt() }.sorted()

    if(n == 1){
        bw.write("${array[0]}")
    }else if(n % 2 == 0)
        bw.write("${array[n / 2 - 1]}")
    else
        bw.write("${array[n / 2]}")


    bw.close()
    br.close()
}