import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val n = input.length
    var r = 0
    var c = 0
    val sqrt = sqrt(n.toDouble()).toInt()

    for(i in 1 .. sqrt){
        if(n % i == 0){
            r = i
            c = n/i
        }
    }

    var seq = 0
    val array = Array(r){ Array(c){' '} }
    for(i in 0 until c){
        for(j in 0 until r)
            array[j][i] = input[seq++]
    }

    array.forEach {
        it.forEach { v ->
            bw.write("$v")
        }
    }

    bw.close()
    br.close()
}
