import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val can = listOf('p', 'k', 'c')
    var index = 0
    var flag = true

    while(index < input.length){
        if(input[index] in can){
            when(input[index]){
                'p' -> {
                    if(index+1 < input.length){
                        if(input[index+1] == 'i')
                            index += 2
                        else{
                            flag = false
                            break
                        }
                    }else{
                        flag = false
                        break
                    }
                }
                'k' -> {
                    if(index+1 < input.length) {
                        if (input[index + 1] == 'a')
                            index += 2
                        else {
                            flag = false
                            break
                        }
                    }else{
                        flag = false
                        break
                    }
                }
                'c' ->{
                    if(index+1 < input.length && index+2 < input.length){
                        if(input[index+1] == 'h' && input[index+2] == 'u')
                            index += 3
                        else{
                            flag = false
                            break
                        }
                    }else{
                        flag = false
                        break
                    }

                }
            }
        }else{
            flag = false
            break
        }
    }

    if(flag)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}