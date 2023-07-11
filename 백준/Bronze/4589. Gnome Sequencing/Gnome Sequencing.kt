import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("Gnomes:\n")
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map { it.toInt() }

        if(checkEqual(input, input.sorted()) || checkEqual(input, input.sortedDescending()))
            bw.write("Ordered\n")
        else
            bw.write("Unordered\n")
    }

    bw.close()
    br.close()
}

fun checkEqual(v1 : List<Int>, v2 : List<Int>) : Boolean{
    for(i in v1.indices){
        if(v1[i] != v2[i])
            return false
    }

    return true
}
