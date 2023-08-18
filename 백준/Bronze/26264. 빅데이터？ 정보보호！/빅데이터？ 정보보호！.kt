import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().toInt()
    var input = br.readLine()
    var bigData = 0
    var security = 0

    input = input.replace("security", "1")
    input = input.replace("bigdata", "2")

    input.forEach {
        when(it){
            '1' -> security++
            '2' -> bigData++
        }
    }

    if(bigData > security)
        bw.write("bigdata?")
    else if(security > bigData)
        bw.write("security!")
    else
        bw.write("bigdata? security!")

    bw.close()
    br.close()
}