import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }
    val binary = listOf("000", "001", "010", "011", "100", "101", "110", "111")
    val sb = StringBuilder()

    for(i in input)
        sb.append(binary[i])

    repeat(2){
        if(sb[0] == '0')
            sb.deleteAt(0)
    }
    
    bw.write(sb.toString())
    bw.close()
    br.close()
}