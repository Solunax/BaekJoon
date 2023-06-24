import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val box = br.readLine().split(" ").map { it.toInt() }
    val book = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    var now = 0
    var index = 0

    book.forEach {
        if(now + it <= box[index])
            now += it
        else{
            result += box[index] - now
            index++

            while (true){
                if(it <=box[index]){
                    now = it
                    break
                }else
                    result += box[index++]
            }
        }
    }
    result += box[index] - now
    for(i in index + 1 until n)
        result += box[i]

    bw.write("$result")

    bw.close()
    br.close()
}