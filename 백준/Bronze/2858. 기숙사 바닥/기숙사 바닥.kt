import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (red, brown) = br.readLine().split(" ").map { it.toInt() }
    var l = 0
    var w = 0

    for(i in 3 .. 5000){
        for(j in 3 .. 5000){
            if(i * 2 + (j - 2) * 2 == red && (i - 2) * (j - 2) == brown){
                l = i
                w = j
                break
            }
        }

        if(l != 0)
            break
    }

    if(w > l)
        l = w.also { w = l }

    bw.write("$l $w")

    bw.close()
    br.close()
}