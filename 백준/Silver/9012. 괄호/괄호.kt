import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val array = ArrayList<Int>()
var top = -1
var flag = true

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val input = br.readLine()

        for(j in input.indices){
            if(input[j] == '('){
                top++
                array.add(1)
            } else if(input[j] == ')' && top > -1){
                top--
                array.removeLast()
            } else{
                top++
                break
            }
        }

        if(top == -1 && array.size == 0)
            bw.write("YES\n")
        else
            bw.write("NO\n")

        top = -1
        array.clear()
    }

    bw.flush()
    br.close()
    bw.close()
}