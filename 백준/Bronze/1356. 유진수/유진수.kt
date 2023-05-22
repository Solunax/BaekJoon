import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val len = input.length
    var check = false

    for(i in 1 until len){
        val a = input.substring(0, i)
        val b = input.substring(i)

        var multiA = 1
        a.forEach {
            multiA *= it - '0'
        }

        var multiB = 1
        b.forEach {
            multiB *= it - '0'
        }

        if(multiA == multiB){
            check = true
            break
        }
    }

    if(check)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}