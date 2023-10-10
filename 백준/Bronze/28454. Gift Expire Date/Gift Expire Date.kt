import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (nowY, nowM, nowD) = br.readLine().split("-").map { it.toInt() }
    var result = 0

    repeat(br.readLine().toInt()){
        val (expireY, expireM, expireD) = br.readLine().split("-").map { it.toInt() }

        if(nowY < expireY)
            result++
        else if(nowY == expireY){
            if(nowM < expireM)
                result++
            else if(nowM == expireM){
                if(nowD <= expireD)
                    result++
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}