import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val w = Array(10){0}
    repeat(10){
        w[it] = br.readLine().toInt()
    }

    val k = Array(10){0}
    repeat(10){
        k[it] = br.readLine().toInt()
    }
    w.sortDescending()
    k.sortDescending()

    var wSum = 0
    var kSum = 0

    for(i in 0 until 3){
        wSum += w[i]
        kSum += k[i]
    }

    bw.write("$wSum $kSum")

    bw.close()
    br.close()
}