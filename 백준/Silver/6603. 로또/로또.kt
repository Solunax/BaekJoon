import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var input = ArrayList<Int>()
var check = emptyArray<Boolean>()

fun main() {
    while(true){
        input = br.readLine().split(" ").map { it.toInt() } as ArrayList<Int>

        if(input.first() == 0)
            break
        input.removeFirst()

        check = Array(input.size){false}
        input.sort()

        search(0, 0)
        bw.write("\n")
    }

    bw.close()
    br.close()
}

fun search(start:Int, index:Int){
    if(index == 6){
        for(i in 0 until input.size){
            if(check[i])
                bw.write("${input[i]} ")
        }
        bw.write("\n")
    }

    for(i in start until input.size){
        check[i] = true
        search(i + 1, index + 1)
        check[i] = false
    }
}