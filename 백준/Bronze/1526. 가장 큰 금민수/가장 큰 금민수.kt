import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    for(i in br.readLine().toInt() downTo 4){
        val num = i.toString()
        var flag = true
        for(j in num.indices){
            if(num[j] != '4' && num[j] !='7'){
                flag = false
                break
            }
        }

        if(flag){
            bw.write("$i")
            break
        }
    }

    br.close()
    bw.close()
}