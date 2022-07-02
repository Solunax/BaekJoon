import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toCharArray()

    val array = Array(input.size){' '}
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
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}