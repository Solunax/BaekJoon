import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val (y, x) = Pair(sc.nextInt(), sc.nextInt())
    sc.nextLine()
    val inputArray:Array<Array<Char>> = Array(y){Array(x){' '} }

    val white = arrayOf(
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
    )

    val black = arrayOf(
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
    )
    var result = 64
    for(i in 0 until y){
        val lineData = sc.nextLine()
        for(j in 0 until x)
            inputArray[i][j] = lineData[j]
    }

    for(i in 0 until y - 7){
        for(j in 0 until  x - 7){
            var tempB = 0
            var tempW = 0

            for(a in 0 until 8){
                for(b in 0 until 8){
                    if(inputArray[i+a][j+b] != black[a][b])
                        tempB++
                    if(inputArray[i+a][j+b] != white[a][b])
                        tempW++
                }
            }
            result = minOf(tempB, tempW, result)
        }
    }
    println(result)
}