import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().toInt()
var count = 0

fun main() {
    println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    repeat(input, count)
}

fun repeat(number:Int, count:Int){
    var s = ""
    for(i in 0 until count)
        s += "____"

    println("$s\"재귀함수가 뭔가요?\"")
    if(number != 0){
        println("$s\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.")
        println(s+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")
        println(s+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"")
    }else{
        println("$s\"재귀함수는 자기 자신을 호출하는 함수라네\"")
    }
    if(number != 0)
        repeat(number - 1, count + 1)
    println(s+"라고 답변하였지.")
}