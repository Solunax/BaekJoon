import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val kor = listOf('K', 'O', 'R', 'E', 'A')
    val yon = listOf('Y', 'O', 'N' ,'S' , 'E', 'I')
    var kIndex = 0
    var yIndex = 0

    val input = br.readLine()
    for(i in input.indices){
        if(input[i] == kor[kIndex]){
            kIndex++

            if(kIndex == 5){
                bw.write("KOREA")
                break
            }
        }

        if(input[i] == yon[yIndex]){
            yIndex++

            if(yIndex == 6){
                bw.write("YONSEI")
                break
            }
        }

    }

    bw.close()
    br.close()
}