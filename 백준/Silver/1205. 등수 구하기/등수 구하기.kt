import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, sc, p) = br.readLine().split(" ").map { it.toInt() }
    val score : Array<Int> = if(n != 0)
        br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    else
        emptyArray()

    if(n == 0)
        bw.write("1")
    else{
        if(n == p && score.last() >= sc)
            bw.write("-1")
        else{
            var rank = 1
            for(i in 0 until n){
                if(sc >= score[i]){
                    rank = i + 1
                    break
                }else{
                    rank++
                }
            }

            if(rank <= p)
                bw.write("$rank")
            else
                bw.write("-1")
        }
    }

    br.close()
    bw.close()
}