import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val set = HashSet<Char>()
    val want = listOf('M', 'O', 'B', 'I', 'S')

    br.readLine().forEach {
        set.add(it)
    }

    var check = true
    want.forEach {
        if(!set.contains(it))
            check = false
    }

    if(check)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}