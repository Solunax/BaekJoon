import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val stack = ArrayList<Int>()
var sb = StringBuilder()
var flag = true

fun main() {
    val case = br.readLine().toInt()

    var number = 1
    stack.add(number)
    sb.append("+\n")

    for(i in 0 until case){
        if(!flag)
            break

        val input = br.readLine().toInt()
        try{
            while(true){
                if(stack.size != 0 && (stack.last() == input)){
                    stack.removeLast()
                    sb.append("-\n")
                    break
                }else if(number > input){
                    flag = false
                    sb = StringBuilder("NO")
                    break
                }

                number++
                stack.add(number)
                sb.append("+\n")
            }
        }catch (e:Exception){
            sb = StringBuilder("NO")
        }
    }

    bw.write(sb.toString())
    br.close()
    bw.close()
}