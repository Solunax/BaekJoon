import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    while(true){
        var check = true

        for(i in 0 until 4){
            if(arr[i] > arr[i + 1]){
                check = false
                arr[i] = arr[i + 1].also { arr[i + 1] = arr[i]}
                printArr(arr)
            }
        }

        if(check)
            break
    }

    bw.close()
    br.close()
}

fun printArr(arr : Array<Int>){
    arr.forEach {
        bw.write("$it ")
    }
    bw.write("\n")
}