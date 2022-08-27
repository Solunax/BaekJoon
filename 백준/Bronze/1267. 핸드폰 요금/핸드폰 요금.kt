import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val time = br.readLine().split(" ").map { it.toInt() }

    val y = 29
    val m = 59

    var yResult = 0
    var mResult = 0

    time.forEach {
        var yTime = 0
        while(true){
            if(y + (30 * yTime) >= it ){
                yResult += 10 * (yTime + 1)
                break
            }else
                yTime++
        }

        var mTime = 0
        while(true){
            if(m + (60 * mTime) >= it ){
                mResult += 15 * (mTime + 1)
                break
            }else
                mTime++
        }
    }

    if(yResult > mResult)
        bw.write("M $mResult")
    else if(yResult < mResult)
        bw.write("Y $yResult")
    else
        bw.write("Y M $yResult")

    bw.close()
    br.close()
}
