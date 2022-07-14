import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, m) = br.readLine().split(" ").filter { it.isNotEmpty() }.map{ it.toInt() }
    val array = ArrayList<Int>()

    var result = 0
    for(i in 0 until n){
        val (p, l) = br.readLine().split(" ").filter { it.isNotEmpty() }.map{ it.toInt() }
        val input = br.readLine().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.toMutableList()
        if(l > p){
            if(m > 0){
                m -= 1
                result += 1
            }
        }else{
            input.sort()
            array.add(input[p - l])
        }
    }

    array.sort()
    for(i in 0 until array.size){
        if(m >= array[i]){
            m -= array[i]
            result++
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}
