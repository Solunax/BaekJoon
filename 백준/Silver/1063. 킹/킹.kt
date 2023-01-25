import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val rows = listOf("8", "7", "6", "5", "4", "3", "2", "1")
val columns = listOf("A", "B", "C", "D", "E", "F", "G", "H")
val map = Array(8){ Array(8){" "} }

fun main() {
    val (king, stone, n) = br.readLine().split(" ")

    val (kingColumn, kingRow) = king.split("").filter { it.isNotEmpty() }
    map[rows.indexOf(kingRow)][columns.indexOf(kingColumn)] = "K"

    val (stoneColumn, stoneRow) = stone.split("").filter { it.isNotEmpty() }
    map[rows.indexOf(stoneRow)][columns.indexOf(stoneColumn)] = "S"

    var column = columns.indexOf(kingColumn)
    var row = rows.indexOf(kingRow)

    repeat(n.toInt()){
        when(val command = br.readLine()){
            "R" -> {
                if(move(row, column+1, command))
                    column += 1
            }
            "L" -> {
                if(move(row, column-1, command))
                    column -= 1
            }
            "B" -> {
                if(move(row+1, column, command))
                    row += 1
            }
            "T" -> {
                if(move(row-1, column, command))
                    row -= 1
            }
            "RT" -> {
                if(move(row-1, column+1, command)){
                    row -= 1
                    column += 1
                }
            }
            "LT" -> {
                if(move(row-1, column-1, command)){
                    row -= 1
                    column -= 1
                }
            }
            "RB" -> {
                if(move(row+1, column+1, command)){
                    row += 1
                    column += 1
                }
            }
            "LB" -> {
                if(move(row+1, column-1, command)){
                    row += 1
                    column -= 1
                }
            }
        }
    }

    var resultKing = ""
    var resultStone = ""
    for(i in 0 until 8){
        for(j in 0 until 8){
            if(map[i][j] == "K")
                resultKing = "${columns[j]}${rows[i]}"

            if(map[i][j] == "S")
                resultStone = "${columns[j]}${rows[i]}"
        }
    }
    bw.write("$resultKing\n")
    bw.write(resultStone)

    br.close()
    bw.close()
}

fun move(row : Int, column : Int, command : String) : Boolean{
    var stoneRow = row
    var stoneColumn = column

    if(row > 7 || row < 0 || column > 7 || column < 0)
        return false

    var stoneFlag = false
    if(map[row][column] == "S"){
        stoneFlag = true

        when(command){
            "R" -> stoneColumn += 1
            "L" -> stoneColumn -= 1
            "B" -> stoneRow += 1
            "T" -> stoneRow -= 1
            "RT" -> {
                stoneRow -= 1
                stoneColumn += 1
            }
            "LT" -> {
                stoneRow -= 1
                stoneColumn -= 1
            }
            "RB" -> {
                stoneRow += 1
                stoneColumn += 1
            }
            "LB" -> {
                stoneRow += 1
                stoneColumn -= 1
            }
        }

        if(stoneRow > 7 || stoneRow < 0 || stoneColumn > 7 || stoneColumn < 0)
            return false
    }

    map[row][column] = "K"

    if (stoneFlag)
        map[stoneRow][stoneColumn] = "S"

    when(command){
        "R" -> map[row][column-1] = " "
        "L" -> map[row][column+1] = " "
        "B" -> map[row-1][column] = " "
        "T" -> map[row+1][column] = " "
        "RT" -> map[row+1][column-1] = " "
        "LT" -> map[row+1][column+1] = " "
        "RB" -> map[row-1][column-1] = " "
        "LB" -> map[row-1][column+1] = " "
    }

    return true
}