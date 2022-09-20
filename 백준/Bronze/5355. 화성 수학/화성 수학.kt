import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ")

        var number = input[0].toDouble()

        for(i in 1 until input.size){
            when(input[i]){
                "@" -> number *= 3
                "%" -> number += 5
                "#" -> number -= 7
            }
        }
        val str = "%.2f".format(number)
        bw.write("$str\n")
    }

    bw.close()
    br.close()
}