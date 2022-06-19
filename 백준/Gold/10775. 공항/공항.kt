import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val numberOfGate = br.readLine().toInt()
val numberOfPlane = br.readLine().toInt()
val array = Array(numberOfGate + 1){ 0 }

fun main() {

    for(i in 0 until numberOfGate + 1)
        array[i] = i

    var result = 0
    for(i in 0 until numberOfPlane){
        val input = br.readLine().toInt()
        val docking = search(input)

        if(docking == 0)
            break
        result++

        union(docking, docking - 1)
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun union(val1:Int, val2:Int){
    val x = search(val1)
    val y = search(val2)
    
    if(x != y) {
        if(x < y)
            array[y] = x
        else
            array[x] = y
    }

}

fun search(value:Int):Int{
    return if(value == array[value])
        value
    else
        search(array[value]).also { array[value] = it }
}