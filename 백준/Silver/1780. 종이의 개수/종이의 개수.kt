import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val length = br.readLine().toInt()
val array = Array(length){Array(length){ 0 } }
var zero = 0
var one = 0
var mone = 0

fun main() {
    for(i in 0 until length)
        array[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    divide(0, 0, length)
    bw.write("$mone\n")
    bw.write("$zero\n")
    bw.write("$one\n")
    bw.close()
    br.close()
}

fun divide(row:Int, col:Int, size:Int){
    if(numberCheck(row, col, size)){
        if(array[row][col] == 0)
            zero++
        else if(array[row][col] == 1)
            one++
        else
            mone++
        return
    }

    val divideSize = size / 3
    divide(row, col, divideSize)
    divide(row, col + divideSize, divideSize)
    divide(row, col + (divideSize * 2), divideSize)
    divide(row + divideSize, col, divideSize)
    divide(row + divideSize, col + divideSize, divideSize)
    divide(row + divideSize, col + (divideSize * 2), divideSize)
    divide(row + (divideSize * 2), col, divideSize)
    divide(row + (divideSize * 2), col + divideSize, divideSize)
    divide(row + (divideSize * 2), col + (divideSize * 2), divideSize)
}

fun numberCheck(row:Int, col:Int, size:Int):Boolean{
    val value = array[row][col]

    for(i in row until row + size){
        for(j in col until col + size){
            if(array[i][j] != value)
                return false
        }
    }
    return true
}