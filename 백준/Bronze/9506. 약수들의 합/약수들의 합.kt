import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().toInt()

        if(input == -1)
            break

        var sum = 0
        val arr = ArrayList<Int>()

        for(i in 1 until input){
            if(input % i == 0){
                sum += i
                arr.add(i)
            }
        }

        if(sum == input)
            bw.write("$input = ${arr.joinToString(" + ")}\n")
        else
            bw.write("$input is NOT perfect.\n")
    }

    bw.close()
    br.close()
}