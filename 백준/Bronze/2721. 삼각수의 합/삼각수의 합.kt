import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()

        var t = 1
        var add = 2
        var sum = 0
        for(k in 1 .. n){
            t += add
            sum += k * t
            add++
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}