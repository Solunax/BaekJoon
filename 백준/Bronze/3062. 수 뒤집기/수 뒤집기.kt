import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    for(i in 0 until case){
        val input = br.readLine()
        val value = (input.toInt() + input.reversed().toInt()).toString()
        val length = value.length
        var flag = true

        val array = Array(length){' '}
        for(j in 0 until length / 2)
            array[j] = value[j]
        array.reverse()

        if(length % 2 == 0){
            for(k in length / 2 until length){
                if(value[k] != array[k]){
                    flag = false
                    break
                }
            }
        }else{
            for(k in length / 2 + 1 until length){
                if(value[k] != array[k]){
                    flag = false
                    break
                }
            }
        }

        if(flag)
            bw.write("YES\n")
        else
            bw.write("NO\n")
    }

    bw.close()
    br.close()
}
