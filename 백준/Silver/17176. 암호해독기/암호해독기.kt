import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val code = br.readLine().split(" ").map { it.toInt() }
    val normal = br.readLine().toCharArray().sorted()

    val str = ArrayList<Char>()
    code.forEach {
        if(it == 0)
            str.add(' ')
        else{
            when(it){
                in 1..26 -> str.add((it-1+'A'.code).toChar())
                in 27..52 -> str.add((it-27+'a'.code).toChar())
            }
        }
    }
    str.sort()

    var check = true
    for(i in 0 until n){
        if(str[i] != normal[i]){
            check = false
            break
        }
    }

    if(check)
        bw.write("y")
    else
        bw.write("n")

    br.close()
    bw.close()
}