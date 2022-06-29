import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().toCharArray()
        if(input[0] == '0')
            break

        val array = Array(input.size){ ' ' }
        for(i in 0 until input.size / 2)
            array[i] = input[i]
        array.reverse()

        var flag = true
        if(input.size % 2 == 0){
            for(i in input.size / 2 until input.size){
                if(array[i] != input[i]){
                    flag = false
                    break
                }
            }
        }else{
            for(i in input.size / 2 + 1 until input.size){
                if(array[i] != input[i]){
                    flag = false
                    break
                }
            }
        }

        if(flag)
            bw.write("yes\n")
        else
            bw.write("no\n")
    }
    bw.close()
    br.close()
}