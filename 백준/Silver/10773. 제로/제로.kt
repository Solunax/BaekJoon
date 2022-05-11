import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val array = ArrayList<Int>()
fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val input = br.readLine().toInt()

        if(input != 0)
            array.add(input)
        else
            array.removeLast()
    }

    var sum = 0
    array.forEach {
        sum += it
    }

    bw.write("$sum")
    bw.flush()
    br.close()
    bw.close()
}