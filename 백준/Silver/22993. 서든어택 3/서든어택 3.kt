import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    val atk = ArrayList<Long>()
    var jun = 0L

    for(i in 0 until n){
        if(i == 0)
            jun = input.nextToken().toLong()
        else
            atk.add(input.nextToken().toLong())
    }

    atk.sort()
    var flag = true
    for(i in 0 until atk.size){
        if(jun <= atk[i]){
            flag = false
            break
        }else
            jun += atk[i]
    }

    if(flag)
        bw.write("Yes")
    else
        bw.write("No")

    bw.close()
    br.close()
}