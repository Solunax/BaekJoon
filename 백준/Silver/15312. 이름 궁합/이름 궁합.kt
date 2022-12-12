import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val alpha = listOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)

fun main() {
    val me = br.readLine()
    val her = br.readLine()
    val name = ArrayList<Int>()
    val temp = ArrayList<Int>()

    for(i in me.indices){
        name.add(alpha[me[i]-'A'])
        name.add(alpha[her[i]-'A'])
    }

    while(name.size > 2){
        for(i in 0 until name.size-1)
            temp.add((name[i] + name[i+1])%10)

        name.clear()
        name.addAll(temp)
        temp.clear()
    }
    bw.write("${name[0]}${name[1]}")


    br.close()
    bw.close()
}