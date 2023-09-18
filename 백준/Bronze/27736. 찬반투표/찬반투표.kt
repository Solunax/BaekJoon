import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val total = br.readLine().toInt()
    var yes = 0
    var no = 0
    var abstain = 0

    br.readLine().split(" ").map { it.toInt() }.forEach {
        when(it){
            1 -> yes++
            -1 -> no++
            else -> abstain++
        }
    }
    
    val half = if(total % 2 == 0)
        total / 2
    else
        total / 2 + 1
    
    if(abstain >= half)
        bw.write("INVALID")
    else if(yes > no)
        bw.write("APPROVED")
    else
        bw.write("REJECTED")

    bw.close()
    br.close()
}