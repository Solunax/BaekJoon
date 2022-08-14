import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()
        if(input.isNullOrEmpty())
            break
        val location = input.split(" ").map { it.toInt() }
        var a = location[0]
        var b = location[1]
        var c = location[2]

        var result = 0
        while(true){
            if(a + 1 == b && b + 1 == c){
                bw.write("$result\n")
                break
            }else{
                val difA = b - a
                val difB = c - b

                if(difA > difB){
                    c = b
                    b -= 1
                    result++
                }else{
                    a = b
                    b += 1
                    result++
                }
            }
        }
    }
    bw.close()
    br.close()
}