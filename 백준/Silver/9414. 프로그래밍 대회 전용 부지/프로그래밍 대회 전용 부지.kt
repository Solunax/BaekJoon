import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val array = ArrayList<Int>()
        var result = 0L
        while (true){
            val input = br.readLine().toInt()
            if(input != 0)
                array.add(input)
            else
                break
        }

        var powValue = 1
        array.sortedDescending().forEach {
            result += 2 * it.toDouble().pow(powValue++).toLong()
        }

        if(result <= 5 * 10.0.pow(6).toLong())
            bw.write("$result\n")
        else
            bw.write("Too expensive\n")
    }

    bw.close()
    br.close()
}
