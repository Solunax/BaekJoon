import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine()
        val v1 = br.readLine().split(" ").map { it.toInt() }
        val v2 = br.readLine().split(" ").map { it.toInt() }.sorted()

        var sum = 0
        v1.forEach {
            sum += search(it, v2)
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}

fun search(value : Int, array : List<Int>) : Int{
    var start = 0
    var end = array.size - 1
    var index = -1

    while(start <= end){
        val center = (start + end) / 2
        if(array[center] < value){
            index = center
            start = center + 1
        }
        else
            end = center - 1
    }

    return index + 1
}