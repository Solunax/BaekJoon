import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val array = ArrayList<String>()

    for(i in input.indices){
        val string = input.substring(i, input.length)
        array.add(string)
    }
    array.sort()

    array.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}