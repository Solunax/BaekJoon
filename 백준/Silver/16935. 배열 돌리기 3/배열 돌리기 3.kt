import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val input = br.readLine().split(" ").map { it.toInt() }
var n  = input[0]
var m = input[1]
var arr = Array(n){Array(m){0}}

fun main() {
    repeat(n){
        arr[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    br.readLine().split(" ").map { it.toInt() }.forEach {
        when(it){
            1 -> reverseTopBottom()
            2 -> reverseLeftRight()
            3 -> rotateRight()
            4 -> rotateLeft()
            5 -> blockRight()
            6 -> blockLeft()
        }
    }

    printResult()

    br.close()
    bw.close()
}

fun reverseTopBottom(){
    val newArr = Array(n){Array(m){0}}

    for(i in 0 until n){
        for(j in 0 until m)
            newArr[i][j] = arr[n-1-i][j]
    }

    arr = newArr
}

fun reverseLeftRight(){
    val newArr = Array(n){Array(m){0}}

    for(i in 0 until n){
        for(j in 0 until m)
            newArr[i][j] = arr[i][m-1-j]
    }

    arr = newArr
}

fun rotateRight(){
    val newArr = Array(m){Array(n){0}}

    var value = n-1
    for(i in 0 until n){
        for(j in 0 until m)
            newArr[j][value] = arr[i][j]

        value--
    }

    n = m.also { m = n }
    arr = newArr
}

fun rotateLeft(){
    val newArr = Array(m){Array(n){0}}

    for(i in 0 until n){
        for(j in 0 until m)
            newArr[m-1-j][i] = arr[i][j]
    }

    n = m.also { m = n }
    arr = newArr
}

fun blockRight(){
    val newArr = Array(n){Array(m){0}}

    val nMid = n/2
    val mMid = m/2

    for(i in 0 until nMid){
        for(j in 0 until mMid)
            newArr[i][mMid+j] = arr[i][j]
    }

    for(i in 0 until nMid){
        for(j in mMid until m)
            newArr[nMid+i][j] = arr[i][j]
    }

    for(i in nMid until n){
        var column = 0
        for(j in mMid until m){
            newArr[i][column] = arr[i][j]
            column++
        }
    }

    var row = 0
    for(i in nMid until n){
        for(j in 0 until mMid)
            newArr[row][j] = arr[i][j]
        row++
    }

    arr = newArr
}

fun blockLeft(){
    val newArr = Array(n){Array(m){0}}

    val nMid = n/2
    val mMid = m/2

    for(i in 0 until nMid){
        for(j in 0 until mMid)
            newArr[nMid+i][j] = arr[i][j]
    }

    for(i in nMid until n){
        for(j in 0 until mMid)
            newArr[i][mMid+j] = arr[i][j]
    }

    var row = 0
    for(i in nMid until n){
        for(j in mMid until m)
            newArr[row][j] = arr[i][j]

        row++
    }

    for(i in 0 until nMid){
        var column = 0
        for(j in mMid until m){
            newArr[i][column] = arr[i][j]
            column++
        }
    }

    arr = newArr
}

fun printResult(){
    arr.forEach {
        it.forEach { v ->
            bw.write("$v ")
        }
        bw.write("\n")
    }
}