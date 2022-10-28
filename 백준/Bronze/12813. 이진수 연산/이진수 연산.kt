import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }
    val b = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }

    and(a, b)
    or(a, b)
    xor(a, b)
    not(a)
    not(b)

    bw.close()
    br.close()
}

fun and(a:List<Int>, b:List<Int>){
    for(i in a.indices){
        if(a[i]==1 && b[i] ==1)
            bw.write("1")
        else
            bw.write("0")
    }
    bw.write("\n")
}

fun or(a:List<Int>, b:List<Int>){
    for(i in a.indices){
        if(a[i]==1 || b[i]==1)
            bw.write("1")
        else
            bw.write("0")
    }
    bw.write("\n")
}

fun not(v:List<Int>){
    for(i in v.indices){
        if(v[i] == 1)
            bw.write("0")
        else
            bw.write("1")
    }
    bw.write("\n")
}

fun xor(a:List<Int>, b:List<Int>) {
    for (i in a.indices) {
        if (a[i] != b[i])
            bw.write("1")
        else
            bw.write("0")
    }
    bw.write("\n")
}