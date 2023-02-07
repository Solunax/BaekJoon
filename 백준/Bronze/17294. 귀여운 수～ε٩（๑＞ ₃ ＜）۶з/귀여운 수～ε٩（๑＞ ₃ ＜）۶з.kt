import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }

    val result = if(num.size == 1)
        "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!"
    else{
        val diff = abs(num[0] - num[1])
        val check = num[0] > num[1]

        var flag = true
        for(i in 0 until num.size-1){
            if(check){
                if(num[i] - diff != num[i+1]){
                    flag = false
                    break
                }
            }else{
                if(num[i] + diff != num[i+1]){
                    flag = false
                    break
                }
            }
        }

        if(flag)
            "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!"
        else
            "흥칫뿡!! <(￣ ﹌ ￣)>"
    }
    bw.write(result)

    br.close()
    bw.close()
}