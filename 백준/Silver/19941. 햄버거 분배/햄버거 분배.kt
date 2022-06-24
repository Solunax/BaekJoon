import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val table = br.readLine().toCharArray()

    var result = 0

    for(i in 0 until n){
        if(table[i] == 'P'){
            var start = i - k
            var end = i + k
            if(start <= 0)
                start = 0
            if(end >= n)
                end = n - 1

            for(j in start .. end){
                if(table[j] == 'H'){
                    result++
                    table[j] = '_'
                    break
                }
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}