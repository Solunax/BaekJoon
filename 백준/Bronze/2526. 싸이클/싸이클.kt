import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, p) = br.readLine().split(" ").map{ it.toInt() }
    val result = Array(p+1){0}
    var flag = true
    var temp = n
    var index = 0

    while(flag){
        temp = n * temp % p

        for(i in 0 until index){
            if(result[i] == temp){
                bw.write("${index-i}")
                flag = false
                break
            }
        }

        result[index] = temp
        index++
    }

    br.close()
    bw.close()
}