import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Hashtable
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val inputString = br.readLine().toString()
    val array = inputString.split("").filter { it.isNotEmpty() }
    val result = HashSet<String>()

    val sb = StringBuilder()
    for(i in array.indices){
        for(j in i until array.size){
            sb.append(array[j])
            result.add(sb.toString())
        }
        sb.clear()
    }

    bw.write("${result.size}")
    br.close()
    bw.close()
}