import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val before = br.readLine().toCharArray()
    val after = br.readLine().toCharArray()

    var flag = false
    if(n % 2 == 0)
        flag = true

    var result = ""
    for(i in before.indices){
        if((before[i] == after[i]) != flag){
            result = "Deletion failed"
            break
        }
    }

    if(result.isEmpty())
        result = "Deletion succeeded"

    bw.write(result)

    bw.close()
    br.close()
}
