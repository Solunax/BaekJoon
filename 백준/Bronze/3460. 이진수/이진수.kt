import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = Integer.toBinaryString(br.readLine().toInt()).reversed()

        for(i in input.indices){
            if(input[i] == '1')
                bw.write("$i ")
        }
    }

    br.close()
    bw.close()
}