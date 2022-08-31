import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    repeat(n){
        val input = br.readLine().split(" ").map{v -> v.toInt()}.toMutableList()
        input.removeAt(0)
        input.sortDescending()

        var gap = 0
        for(i in 0 until input.size - 1){
            if(input[i] - input[i+1] > gap)
                gap = input[i] - input[i+1]
        }

        bw.write("Class ${it+1}\n")
        bw.write("Max ${input.first()}, Min ${input.last()}, Largest gap $gap\n")
    }


    bw.close()
    br.close()
}