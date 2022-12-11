import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val a = br.readLine()
        val b = br.readLine()
        var result = 0

        for(i in a.indices){
            if(a[i] != b[i])
                result++
        }

        bw.write("Hamming distance is $result.\n")
    }

    br.close()
    bw.close()
}