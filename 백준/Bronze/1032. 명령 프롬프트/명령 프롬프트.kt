import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.Stack
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfFiles = br.readLine().toInt()
    val files = Array(numberOfFiles){""}

    for(i in 0 until numberOfFiles)
        files[i] = br.readLine().toString()

    val stringLength = files[0].length
    val array = Array(stringLength){true}

    for(i in 1 until numberOfFiles){
        for(j in 0 until stringLength){
            if(files[0][j] != files[i][j])
                array[j] = false
        }
    }

    for(i in 0 until stringLength){
        if(array[i])
            bw.write("${files[0][i]}")
        else
            bw.write("?")
    }

    bw.close()
    br.close()
}