import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var flag = true
    var temp = 0
    
    repeat(m){
        val count = br.readLine().toInt()
        val input = br.readLine().split(" ").map {v -> v.toInt() }
        for(i in 0 until  count - 1){
            if(input[i] < input[i + 1]){
                flag = false
                break
            }
        }
    }

    if(flag)
        bw.write("Yes")
    else
        bw.write("No")

    bw.close()
    br.close()
}