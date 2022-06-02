import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val length = br.readLine().toInt()
val array = Array(length){Array(length){ 0 } }
val result = StringBuilder()
fun main() {
    for(i in 0 until length)
        array[i] = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()

    divide(0, 0, length)
    bw.write("$result")
    bw.close()
    br.close()
}

fun divide(row:Int, col:Int, size:Int){
    if(colorCheck(row, col, size)){
        if(array[row][col] == 0)
            result.append(0)
        else
            result.append(1)
        return
    }
    
    result.append("(")
    val divideSize = size / 2
    divide(row, col, divideSize)
    divide(row, col + divideSize, divideSize)
    divide(row + divideSize, col, divideSize)
    divide(row + divideSize, col + divideSize, divideSize)
    result.append(")")
}

fun colorCheck(row:Int, col:Int, size:Int):Boolean{
    val value = array[row][col]

    for(i in row until row + size){
        for(j in col until col + size){
            if(array[i][j] != value)
                return false
        }
    }
    return true
}