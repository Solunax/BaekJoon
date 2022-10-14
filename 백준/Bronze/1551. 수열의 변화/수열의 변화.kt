import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, k) = br.readLine().split(" ").map{ it.toInt() }
    val array = br.readLine().split(",").map { it.toInt() }.toMutableList()

    repeat(k){
        for(i in 0 until array.size-1)
            array[i] = array[i+1] - array[i]

        array.removeLast()
    }

    for(i in array.indices){
        if(i != array.size-1)
            bw.write("${array[i]},")
        else
            bw.write("${array[i]}")
    }

    bw.close()
    br.close()
}