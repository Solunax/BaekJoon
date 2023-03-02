import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()

    var v1 = arr.size - 1
    var isFirst = true

    for(i in v1 downTo 1){
        if(arr[i] <= arr[i-1]){
            v1 = i
            isFirst = false
            break
        }
    }

    if(isFirst)
        bw.write("-1")
    else{
        var v2 = arr.size - 1
        for(i in v2 downTo 1){
            if(arr[v1 - 1] > arr[i]){
                v2 = i
                break
            }
        }

        arr[v1 - 1] = arr[v2].also { arr[v2] = arr[v1 - 1] }
        arr.reverse(v1, arr.size)

        arr.forEach {
            bw.write("$it ")
        }
    }

    br.close()
    bw.close()
}