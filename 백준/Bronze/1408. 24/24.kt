import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(nH, nM, nS) = br.readLine().split(":").map { it.toInt() }
    var(sH, sM, sS) = br.readLine().split(":").map { it.toInt() }

    val rS = if(sS < nS){
        sM--
        sS+60-nS
    }
    else
        sS-nS

    val rM = if(sM < nM){
        sH--
        sM+60-nM
    }
    else
        sM-nM

    val rH = if(sH < nH)
        sH+24-nH
    else
        sH-nH

    bw.write("%02d:%02d:%02d".format(rH, rM, rS))
    bw.close()
    br.close()
}