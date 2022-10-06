import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = ArrayList<String>()

    for(i in 0 until n){
        val input = br.readLine()
        val reverse = input.reversed()

        if(array.contains(reverse) || input == reverse){
            bw.write("${input.length} ${input[input.length/2]}")
            break
        }
        else
            array.add(input)
    }

    bw.close()
    br.close()
}