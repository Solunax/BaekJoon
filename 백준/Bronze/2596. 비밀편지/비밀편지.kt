import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val enc = listOf("000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010")
    val n = br.readLine().toInt()
    val input = br.readLine()
    val arr = ArrayList<String>()
    val result = StringBuilder()
    var errorCheck = false
    var indexCount = 1

    for(i in 0 until n)
        arr.add(input.substring(i * 6, (i + 1) * 6))

    for(str in arr){
        if(enc.contains(str))
            result.append((enc.indexOf(str)+'A'.code).toChar())
        else{
            var flag = false
            var index = 0

            for(i in 0 until 8){
                var diff = 0

                for(j in 0 until 6){
                    if(enc[i][j] != str[j])
                        diff++
                }

                if(diff == 1){
                    index = i
                    flag = true
                    break
                }
            }

            if(flag)
                result.append((index +'A'.code).toChar())
            else{
                errorCheck = true
                break
            }
        }
        indexCount++
    }

    if(errorCheck)
        bw.write("$indexCount")
    else
        bw.write(result.toString())

    br.close()
    bw.close()
}