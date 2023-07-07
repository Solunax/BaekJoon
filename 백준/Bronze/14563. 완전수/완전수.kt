import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    br.readLine().split(" ").map { it.toInt() }.forEach { num ->
        var sum = 0

        getDiv(num).forEach {
            sum += it
        }

        if(sum == num)
            bw.write("Perfect\n")
        else if(sum > num)
            bw.write("Abundant\n")
        else
            bw.write("Deficient\n")
    }

    bw.close()
    br.close()
}

fun getDiv (num : Int) : List<Int> {
    val arr = ArrayList<Int>()

    for(i in 1 .. sqrt(num.toDouble()).toInt()){
        if(num % i == 0){
            arr.add(i)

            if(num / i != i)
                arr.add(num / i)
        }
    }

    arr.sort()
    arr.removeLast()

    return arr
}