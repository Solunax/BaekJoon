import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }
    val array = LinkedList<String>()
    val string = StringBuilder()

    string.append(input[0])
    for(i in 1 until input.size){
        if(input[i - 1] == input[i])
            string.append(input[i])
        else{
            array.add(string.toString())
            string.clear()
            string.append(input[i])
        }
    }
    array.add(string.toString())
    when (array.size) {
        1 -> bw.write("0")
        2 -> bw.write("1")
        else -> {
            var zero = 0
            var one = 0
            array.forEach {
                if(it.startsWith("1"))
                    one++
                else
                    zero++
            }

            bw.write("${min(zero, one)}")
        }
    }
    bw.close()
    br.close()
}
