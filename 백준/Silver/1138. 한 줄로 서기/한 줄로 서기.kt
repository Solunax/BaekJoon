import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = ArrayList<Int>()
    val input = br.readLine().split(" ").map { it.toInt() }

    for(i in n downTo 1)
        array.add(input[i-1], i)

    for(v in array)
        bw.write("$v ")


    bw.close()
    br.close()
}

