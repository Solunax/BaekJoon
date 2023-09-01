import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result = ArrayList<String>()
    val str = br.readLine()
    val len = str.length

    for(i in 0 until len - 2){
        for(j in i + 1 until len - 1){
            for(k in j + 1 until len){
                val a = str.substring(i, j)
                val b = str.substring(j, k)
                val c = str.substring(k)

                if(len == a.length + b.length + c.length)
                    result.add(a.reversed() + b.reversed() + c.reversed())
            }
        }
    }
    bw.write(result.sorted()[0])

    bw.close()
    br.close()
}