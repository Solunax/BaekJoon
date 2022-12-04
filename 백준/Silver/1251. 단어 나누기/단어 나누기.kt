import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val arr = ArrayList<String>()
    val str = Array(3){""}
    for(i in 1 until input.length-1){
        for(j in i+1 until input.length){
            str[0] = input.substring(0, i).reversed()
            str[1] = input.substring(i, j).reversed()
            str[2] = input.substring(j, input.length).reversed()

            arr.add(str[0]+str[1]+str[2])
        }
    }

    arr.sort()
    bw.write(arr[0])

    br.close()
    bw.close()
}