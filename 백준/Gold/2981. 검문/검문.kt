import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = br.readLine().toInt()
    val array = ArrayList<Int>()

    for(i in 0 until input)
        array.add(br.readLine().toInt())

    array.sort()

    var value = array[1] - array[0]

    for(i in 2 until array.size)
        value = gcd(value, array[i] - array[i - 1])

    for(i in 2 .. value){
        if(value % i == 0)
            bw.write("$i ")
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