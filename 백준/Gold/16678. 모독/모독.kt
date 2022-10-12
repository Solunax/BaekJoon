import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){0}

    repeat(n){
        array[it] = br.readLine().toInt()
    }

    array.sort()
    var result = 0L
    if(array[0] != 1){
        result += array[0] - 1
        array[0] = 1
    }

    for(i in 1 until n){
        if(array[i] > array[i-1]){
            result += array[i] - (array[i-1] + 1)
            array[i] = array[i-1] + 1
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}