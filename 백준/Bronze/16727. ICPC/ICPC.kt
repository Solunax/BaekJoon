import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (p1, e1) = br.readLine().split(" ").map{ it.toInt()}
    val (e2, p2) = br.readLine().split(" ").map{ it.toInt()}

    if(p1 + p2 > e1 + e2)
        bw.write("Persepolis")
    else if(p1 + p2 < e1 + e2)
        bw.write("Esteghlal")
    else{
        if(p2 > e1)
            bw.write("Persepolis")
        else if(p2 < e1)
            bw.write("Esteghlal")
        else
            bw.write("Penalty")
    }

    bw.close()
    br.close()
}