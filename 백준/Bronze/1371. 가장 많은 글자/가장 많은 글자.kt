import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = ArrayList<String>()
    val alpha = Array(26){0}

    while (true){
        val input = br.readLine()
        if(input == null)
            break
        else
            array.add(input)
    }

    array.forEach {
        it.forEach { v ->
            if(v != ' ')
                alpha[v - 'a']++
        }
    }

    var maxValue = 0
    alpha.forEach {
        maxValue = max(maxValue, it)
    }

    for(i in 0 until 26){
        if(alpha[i] == maxValue)
            bw.write("${(i + 'a'.code).toChar()}")
    }

    bw.close()
    br.close()
}