import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = Array(5){CharArray(15)}
    repeat(5){
        val input = br.readLine().toCharArray()
        for(i in input.indices)
            array[it][i] = input[i]
    }

    for(i in 0 until 15){
        for(j in 0 until 5){
            if(array[j][i] != '\u0000')
                bw.write("${array[j][i]}")
        }
    }

    bw.close()
    br.close()
}
