import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = Array(31){false}
    array[0] = true

    repeat(28){
        array[br.readLine().toInt()] = true
    }

    for(i in 1 .. 30){
        if(!array[i])
            bw.write("$i\n")
    }

    bw.close()
    br.close()
}