import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    var cute = 0
    var notCute = 0

    for(i in 0 until case){
        if(br.readLine().toInt() == 1)
            cute++
        else
            notCute++
    }

    if(cute > notCute)
        bw.write("Junhee is cute!")
    else
        bw.write("Junhee is not cute!")

    bw.close()
    br.close()
}