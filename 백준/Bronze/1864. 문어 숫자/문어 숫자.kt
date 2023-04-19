import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = HashMap<Char, Int>()
    num['-'] = 0
    num['\\'] = 1
    num['('] = 2
    num['@'] = 3
    num['?'] = 4
    num['>'] = 5
    num['&'] = 6
    num['%'] = 7
    num['/'] = -1

    while(true){
        val input = br.readLine().reversed()

        if(input == "#")
            break

        var sum = 0
        for(i in input.indices){
            val v = num[input[i]]!!
            sum += v * 8.0.pow(i).toInt()
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}