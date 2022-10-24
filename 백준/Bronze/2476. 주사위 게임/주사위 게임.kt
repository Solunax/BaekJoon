import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var max = 0
    repeat(br.readLine().toInt()){
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
        max = if(a==b && b==c)
            max(triple(a), max)
        else if(a==b)
            max(double(a), max)
        else if(b==c)
            max(double(b), max)
        else if(c==a)
            max(double(c), max)
        else
            max(single(a, b, c), max)
    }

    bw.write("$max")

    bw.close()
    br.close()
}

fun triple(num:Int) : Int{
    return 10000 + num * 1000
}

fun double(num:Int) : Int{
    return 1000 + num * 100
}

fun single(v1:Int, v2:Int, v3:Int) : Int{
    return max(max(v1, v2), v3) * 100
}