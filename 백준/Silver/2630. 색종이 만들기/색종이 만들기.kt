import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val length = br.readLine().toInt()
val array = Array(length){Array(length){ 0 } }
var white = 0
var blue = 0

fun main() {
    for(i in 0 until length)
        array[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    divide(0, 0, length)
    bw.write("$white\n")
    bw.write("$blue")

    bw.close()
    br.close()
}

fun divide(row:Int, col:Int, size:Int){
    if(colorCheck(row, col, size)){
        if(array[row][col] == 0)
            white++
        else
            blue++
        return
    }

    val divideSize = size / 2
    divide(row, col, divideSize)
    divide(row, col + divideSize, divideSize)
    divide(row + divideSize, col, divideSize)
    divide(row + divideSize, col + divideSize, divideSize)
}

fun colorCheck(row:Int, col:Int, size:Int):Boolean{
    val color = array[row][col]

    for(i in row until row + size){
        for(j in col until col + size){
            if(array[i][j] != color)
                return false
        }
    }
    return true
}