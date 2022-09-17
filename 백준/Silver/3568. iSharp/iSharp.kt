import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val string = br.readLine().split(",", ";", " ").filter { it.isNotEmpty() }
    val sb1 = StringBuilder()
    val sb2 = StringBuilder()

    for(i in 1 until string.size){
        var index = 0
        while(index < string[i].length){
            if(string[i][index] in 'a'..'z' || string[i][index] in 'A'..'Z')
                sb1.append(string[i][index])
            else if(string[i][index] == '['){
                sb2.append("][")
                index++
            }else
                sb2.append(string[i][index])

            index++
        }

        bw.write("${string[0]}${sb2.reverse()} $sb1;\n")
        sb1.clear()
        sb2.clear()
    }

    bw.close()
    br.close()
}