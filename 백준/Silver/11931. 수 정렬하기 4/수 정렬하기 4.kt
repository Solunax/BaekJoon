import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = ArrayList<Int>()
    repeat(br.readLine().toInt()){
        arr.add(br.readLine().toInt()+1000000)
    }

    arr.sortedDescending().forEach {
        bw.write("${it-1000000}\n")
    }

    bw.close()
    br.close()
}