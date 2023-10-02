import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<String>>

fun main() {
    val n = br.readLine().toInt()
    map = Array(n){ Array(n){""} }
    var headX = 0
    var headY = 0

    repeat(n){ y ->
        val input = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()
        map[y] = input

        if(headX == 0 && headY ==0){
            for(i in 0 until n)
                if(input[i] == "*"){
                    headX = i
                    headY = y
                }
        }
    }

    var head = 1
    var heartY = 0
    for(i in headY until n){
        if(!heartCheck(headX, i + 1)){
            heartY = i
            bw.write("${heartY + 1} ${headX + 1}\n")
            break
        }
        head++
    }

    var lengthCount = 0
    for(i in 0 until n){
        if(map[heartY][i] == "*"){
            if(i == headX){
                bw.write("$lengthCount ")
                lengthCount = 0
            }
            else
                lengthCount ++
        }
    }
    bw.write("$lengthCount ")

    var spine = 0
    var spineEndY = 0
    for(y in heartY + 1 until n){
        if(map[y][headX] == "*")
            spine++
        else{
            spineEndY = y
            bw.write("$spine ")
            break
        }
    }

    var legLength = 1
    for(y in spineEndY + 1 until n){
        if(map[y][headX - 1] == "*")
            legLength++
        else
            break
    }
    bw.write("$legLength ")

    legLength = 1
    for(y in spineEndY + 1 until n){
        if(map[y][headX + 1] == "*")
            legLength++
        else
            break
    }
    bw.write("$legLength")

    bw.close()
    br.close()
}

fun heartCheck(x : Int, y : Int) : Boolean{
    return map[y][x - 1] == "*" && map[y][x + 1] == "*"
}