import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v = listOf("2", "0", "1", "8")
    val check = HashMap<String, Int>()
    val input = br.readLine().split("").filter { it.isNotEmpty() }
    var flag = true

    for(i in input.indices){
        if(input[i] !in v){
            bw.write("0")
            flag = false
            break
        }else{
            if(check.containsKey(input[i]))
                check[input[i]] = check[input[i]]!! + 1
            else
                check[input[i]] = 1
        }
    }

    if(flag){
        if(check.size != 4)
            bw.write("1")
        else{
            if(check["2"] == check["0"] && check["0"] == check["1"] && check["1"] == check["8"])
                bw.write("8")
            else
                bw.write("2")
        }
    }

    bw.close()
    br.close()
}