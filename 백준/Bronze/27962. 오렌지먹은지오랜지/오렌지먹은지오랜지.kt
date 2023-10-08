import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine()
    var result = "NO"

    for(i in 1 until n){
        val str1 = input.substring(0, i)
        val str2 = input.substring(n - i)
        var diffCount = 0

        for(j in str1.indices){
            if(str1[j] != str2[j])
                diffCount++
        }

        if(diffCount == 1){
            result = "YES"
            break
        }
    }
    bw.write(result)

    bw.close()
    br.close()
}