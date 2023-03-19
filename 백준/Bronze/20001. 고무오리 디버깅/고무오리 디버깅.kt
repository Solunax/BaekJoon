import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    var problem = 0

    while (true){
        val input = br.readLine()

        if(input == "고무오리 디버깅 끝")
            break

        when(input){
            "문제" -> problem++
            "고무오리" -> {
                if(problem == 0)
                    problem += 2
                else
                    problem--
            }
        }
    }

    if(problem == 0)
        bw.write("고무오리야 사랑해")
    else
        bw.write("힝구")

    br.close()
    bw.close()
}