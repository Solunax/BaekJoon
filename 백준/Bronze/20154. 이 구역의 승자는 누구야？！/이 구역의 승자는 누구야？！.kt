import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val line = listOf(3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1)

fun main() {
    val input = br.readLine()
    var arr = ArrayList<Int>()

    input.forEach {
        arr.add(line[it-'A'])
    }

    while(arr.size > 1){
        val temp = ArrayList<Int>()

        for(i in 0 until arr.size-1 step 2)
            temp.add(arr[i] + arr[i+1])

        if(arr.size % 2 == 1)
            temp.add(arr.last())

        arr = temp
    }

    if(arr[0] % 2 == 0 || arr[0] == 0)
        bw.write("You're the winner?")
    else
        bw.write("I'm a winner!")



    br.close()
    bw.close()
}