import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, vital, max, up, down) = br.readLine().split(" ").map { it.toInt() }
    val minVital = vital
    var count = 0
    var result = 0

    while(count != n){
        result++
        if(vital + up <= max){
            vital += up
            count++
        }else{
            vital -= down
            if(vital < minVital)
                vital = minVital
        }

        if(vital + up > max && vital == minVital)
            break
    }

    if(count != n)
        bw.write("-1")
    else
        bw.write("$result")

    bw.close()
    br.close()
}