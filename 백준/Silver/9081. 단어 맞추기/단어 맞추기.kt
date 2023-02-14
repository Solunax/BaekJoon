import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val sb = StringBuilder()

    repeat(br.readLine().toInt()){
        val str = br.readLine().toCharArray()

        if(str.size == 1)
            bw.write("${str[0]}\n")
        else{
            var index1 = -1
            var index2 = 0

            for(i in str.size-1 downTo  1){
                if(str[i-1] < str[i]){
                    index1 = i-1
                    break
                }
            }

            if(index1 != -1){
                for(i in str.size-1 downTo 0){
                    if(str[index1] < str[i]){
                        index2 = i
                        break
                    }
                }

                str[index1] = str[index2].also { str[index2] = str[index1] }
                str.sort(index1+1, str.size)
            }

            str.forEach {
                sb.append(it)
            }
            bw.write("$sb\n")

            sb.clear()
        }
    }

    br.close()
    bw.close()
}