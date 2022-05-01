import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = br.readLine().toInt()
    val array = br.readLine().split(" ").map{ it.toInt() }.toMutableList()

    for(i in 1 until input){
        val value = gcd(array[0], array[i])
        val res = "${array[0]/value}/${array[i]/value}"
        bw.write("$res\n")
    }

    bw.flush()
    br.close()
    bw.close()
}

fun gcd(num1:Int, num2:Int):Int{
    var a = num1
    var b = num2

    while(b != 0){
        a = b.also { b = a % b }
    }

    return a
}