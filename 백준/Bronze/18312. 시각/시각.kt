import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ")
    val end = n.toInt()
    var result = 0

    for(h in 0 .. end){
        for(m in 0 .. 59){
            for(s in 0 .. 59){
                if( "%02d".format(h).contains(k) ||
                    "%02d".format(m).contains(k) ||
                    "%02d".format(s).contains(k))
                    result++
            }
        }
    }

    bw.write("$result")

    br.close()
    bw.close()
}