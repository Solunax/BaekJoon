import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toCharArray()
    val sound = listOf('q', 'u', 'a', 'c', 'k')

    if(input.size % 5 != 0)
        bw.write("-1")
    else{
        var count = 0
        var remainChar = input.size

        while (remainChar != 0){
            var check = false
            val temp = Array(5){0}
            var sIndex = 0
            var index = 0

            while (index < input.size){
                if(input[index] == sound[sIndex]){
                    temp[sIndex++] = index

                    if(sIndex == 5){
                        check = true
                        remainChar -= 5
                        sIndex = 0

                        for(i in 0 until 5)
                            input[temp[i]] = '_'
                    }
                }
                index++
            }

            if(check)
                count++
            else
                break
        }

        bw.write(if(remainChar == 0)
            "$count"
        else
            "-1")
    }

    bw.close()
    br.close()
}