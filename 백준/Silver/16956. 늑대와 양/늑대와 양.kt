import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dx = arrayOf(0, 0, 1, -1)
    val dy = arrayOf(1, -1, 0, 0)
    var flag = true
    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(r){Array(c){""}}

    repeat(r){
        array[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    for(i in 0 until r){
        for(j in 0 until c){
            if(array[i][j] == "W"){
                for(k in 0 until 4){
                    val nx = i + dx[k]
                    val ny = j + dy[k]

                    if((nx in 0 until r) && (ny in 0 until c)){
                        if(array[nx][ny] == ".")
                            array[nx][ny] = "D"
                        else if(array[nx][ny] == "S")
                            flag = false
                    }
                }
            }
        }
    }

    if(flag){
        bw.write("1\n")
        array.forEach {
            it.forEach { v ->
                bw.write(v)
            }
            bw.write("\n")
        }
    }else
        bw.write("0")

    bw.close()
    br.close()
}