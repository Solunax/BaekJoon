import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val set = HashSet<Int>()

    for(i in 1 .. n){
        if(n % i == 0)
            set.add(i)
    }

    if(set.size < k)
        bw.write("0")
    else
        bw.write("${set.toList().sorted()[k - 1]}")

    bw.close()
    br.close()
}