import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val array = HashSet<String>()

    for(i in 0 until n)
        array.add(br.readLine())

    var result = 0
    for(i in 0 until m){
        if(array.contains(br.readLine()))
            result++
    }

    bw.write("$result")
    br.close()
    bw.close()
}