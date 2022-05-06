import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.system.exitProcess

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val array = Array(9){IntArray(9) {0} }

fun main() {
    for(i in 0 until 9)
        array[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    solve(0, 0)

    br.close()
    bw.close()
}

fun solve(row:Int, column:Int){
    if(column == 9){
        solve(row + 1, 0)
        return
    }

    if(row == 9){
        for(i in 0 until 9){
            for(j in 0 until 9)
                bw.write("${array[i][j]} ")
            bw.write("\n")
        }
        bw.flush()
        exitProcess(0)
    }

    if(array[row][column] == 0){
        for(i in 1 .. 9){
            if(checkValue(row, column, i)){
                array[row][column] = i
                solve(row, column + 1)
            }
        }

        array[row][column] = 0
        return
    }

    solve(row, column + 1)
}

fun checkValue(row:Int, column:Int, addValue:Int):Boolean{
    for(i in 0 until 9){
        if(array[row][i] == addValue)
            return false
    }

    for(i in 0 until 9){
        if(array[i][column] == addValue)
            return false
    }

    val locationRow = (row / 3) * 3
    val locationColumn = (column / 3) * 3

    for(i in locationRow until locationRow + 3){
        for(j in locationColumn until locationColumn +3){
            if(array[i][j] == addValue)
                return false
        }
    }

    return true
}