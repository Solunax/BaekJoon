import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Long.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().split(" ").map { it.toInt() }
val array = Array(input[1]){0}

fun main() {
    track(1, 0)

    bw.flush()
    br.close()
    bw.close()
}

fun track(number:Int, count:Int){
    if(count == input[1]){
        array.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
        return
    }

    for(i in number .. input[0]){
        array[count] = i
        track(i + 1, count + 1)
    }
}