import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val origin = br.readLine()
    val originCount = HashMap<Char, Int>()
    setMap(originCount)

    origin.forEach {
        originCount[it] = originCount[it]!! + 1
    }

    var result = 0
    repeat(n-1){
        val input = br.readLine()

        if(abs(origin.length - input.length) <= 1){
            val inputCount = HashMap<Char, Int>()
            setMap(inputCount)

            input.forEach {
                inputCount[it] = inputCount[it]!! + 1
            }

            var diff = 0
            for(c in 'A' .. 'Z')
                diff += abs(originCount[c]!! - inputCount[c]!!)

            if(diff <= 2)
                result++
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}

fun setMap(map : HashMap<Char, Int>){
    for(c in 'A' .. 'Z')
        map[c] = 0
}