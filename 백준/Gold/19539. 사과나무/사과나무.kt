import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val array = br.readLine().split(" ").map { it.toInt() }

    var sum = 0
    var oddCount = 0
    array.forEach {
        sum += it
        if(it % 2 == 1)
            oddCount++
    }

    if(sum % 3 == 0){
        if(sum / 3 >= oddCount)
            bw.write("YES")
        else
            bw.write("NO")
    }else
        bw.write("NO")

    bw.close()
    br.close()
}