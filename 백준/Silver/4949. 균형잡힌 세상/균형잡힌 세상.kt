import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val stack = ArrayList<Int>()
var top = -1
var flag = true

fun main() {
    while(true){
        val input = br.readLine()

        if(input == ".")
            break

        for(j in input.indices){
            try{
                when(input[j]){
                    '(' -> {
                        top++
                        stack.add(1)
                    }
                    '[' -> {
                        top++
                        stack.add(2)
                    }

                    ')' -> {
                        if(stack.last() != 1)
                            break

                        top--
                        stack.removeLast()
                    }

                    ']' -> {
                        if(stack.last() != 2)
                            break

                        top--
                        stack.removeLast()
                    }
                }
            } catch (e:Exception){
                flag = false
                bw.write("no\n")
                break
            }
        }

        if(flag){
            if(top == -1 && stack.size == 0)
                bw.write("yes\n")
            else
                bw.write("no\n")
        }

        top = -1
        flag = true
        stack.clear()
    }


    br.close()
    bw.close()
}