import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val inputs = Array(n){""}

        repeat(n){
            inputs[it] = br.readLine()
        }

        var result = "0"
        var flag = false
        for(i in 0 until n){
            for(j in 0 until n){
                if(i == j)
                    continue

                if(check(inputs[i]+inputs[j])){
                    flag = true
                    result = inputs[i]+inputs[j]
                    break
                }
            }

            if(flag)
                break
        }

        bw.write("$result\n")
    }

    br.close()
    bw.close()
}

fun check(str : String) : Boolean{
    var flag = true
    var left = 0
    var right = str.length-1

    while(left < right){
        if(str[left++] != str[right--]){
            flag = false
            break
        }
    }

    return flag
}